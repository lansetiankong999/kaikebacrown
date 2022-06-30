package com.jump.kaikebacrown;

import com.alibaba.fastjson.JSON;
import com.jump.kaikebacrown.domain.group.*;
import com.jump.kaikebacrown.domain.list.ChapterRootBean;
import com.jump.kaikebacrown.domain.list.Data;
import com.jump.kaikebacrown.domain.singleCourse.ChapterList;
import com.jump.kaikebacrown.domain.singleCourse.CourseRootBean;
import com.jump.kaikebacrown.domain.token.TokenRootBean;
import com.jump.kaikebacrown.domain.video.VideoRootBean;
import com.jump.kaikebacrown.utils.HttpClientUtil;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jump
 */
@Slf4j
@Component
public class Crown {

    @Value("${work.dir}")
    private String workDir;

    @Value("${kkb.cookie}")
    private String cookie;

    @SneakyThrows
    public void generateBat() {
        this.fileIsExist();
        Map<String, String> param = new HashMap<>(5);
        this.setCommonValue(param);
        //我的课程列表
        String jsonsRootBeanString = HttpClientUtil.doGet("https://weblearn.kaikeba.com/student/opt/course/list?type=0&option=2", param);
        ChapterRootBean chapterRootBean = JSON.parseObject(jsonsRootBeanString, ChapterRootBean.class);
        for (Data datum : chapterRootBean.getData()) {
            //在workDir下生成临时文件夹
            File file = new File(workDir + (workDir.endsWith("/") ? "" : File.separator) + datum.getCourseName());
            if (!file.exists()) {
                boolean mkdir = file.mkdir();
            }
            String absolutePath = file.getAbsolutePath();
            //cd D:\BaiduNetdiskDownload\kaikeba\【2023考研】马克思主义原理
            //D:
            IOUtils.write("cd " + absolutePath + "\n" + absolutePath.substring(0, 2) + "\n", new FileOutputStream(workDir + File.separator + datum.getCourseName() + ".bat", true), Charset.defaultCharset());

            //访问每一项课程列表中
            String courseStr = HttpClientUtil.doGet("https://weblearn.kaikeba.com/student/courseinfo?course_id=" + datum.getCourseId() + "&__timestamp=" + System.currentTimeMillis(), param);
            CourseRootBean courseRootBean = JSON.parseObject(courseStr, CourseRootBean.class);
            for (ChapterList chapter : courseRootBean.getData().getChapterList()) {
                //课程列表也许有多节
                String groupStr = HttpClientUtil.doGet("https://weblearn.kaikeba.com/student/chapterinfo?course_id=" + chapter.getCourseId() + "&chapter_id=" + chapter.getChapterId() + "&__timestamp=" + System.currentTimeMillis(), param);
                GroupRootBean groupRootBean = JSON.parseObject(groupStr, GroupRootBean.class);
                com.jump.kaikebacrown.domain.group.Data beanData = groupRootBean.getData();
                if (beanData.getSectionList() == null) {
                    log.info(String.format("groupStr=%s", groupStr));
                    continue;
                }
                //遍历到视屏节点
                for (SectionList section : beanData.getSectionList()) {
                    for (GroupList group : section.getGroupList()) {
                        for (ContentList content : group.getContentList()) {
                            String contentTitle = content.getContentTitle();
                            for (Content c : content.getContent()) {
                                if (c.getVideoId() != 0) {
                                    for (Content c1 : content.getContent()) {
                                        String callbackKey = c1.getCallbackKey();
                                        //获取token
                                        Map<String, String> map = new HashMap<>(5);
                                        this.setCommonValue(map);
                                        String accessTokenStr = HttpClientUtil.doGet("https://weblearn.kaikeba.com/get/bsy_video/access_token", map);
                                        TokenRootBean tokenRootBean = JSON.parseObject(accessTokenStr, TokenRootBean.class);
                                        //获取高清视频文件
                                        HashMap<String, String> objectObjectHashMap = new HashMap<>(5);
                                        this.setCommonValue(objectObjectHashMap);
                                        objectObjectHashMap.put("accept", "*/*");
                                        objectObjectHashMap.put("content-type", "application/json;charset=UTF-8");
                                        objectObjectHashMap.put("host", "api-vod.baoshiyun.com");
                                        String videoStr = HttpClientUtil.doGet("https://api-vod.baoshiyun.com/vod/v1/platform/media/detail?mediaId=" + callbackKey + "&accessToken=" + tokenRootBean.getData().getAccessToken(), objectObjectHashMap);
                                        VideoRootBean videoRootBean = JSON.parseObject(videoStr, VideoRootBean.class);
                                        String playUrl = videoRootBean.getData().getMediaMetaInfo().getVideoGroup().get(0).getPlayURL();
                                        FileOutputStream fileOutputStream = new FileOutputStream(workDir + File.separator + datum.getCourseName() + ".bat", true);
                                        IOUtils.write(String.format("ffmpeg -i %s -c copy -bsf:a aac_adtstoasc %s.mp4\n", playUrl, contentTitle), fileOutputStream, Charset.defaultCharset());
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //dir
            //cmd
            IOUtils.write("\ndir\ncmd\n", new FileOutputStream(workDir + File.separator + datum.getCourseName() + ".bat", true), Charset.defaultCharset());
            log.info(String.format("[%s.bat]脚本文件写入成功！完成后请确保已安装ffmpeg！", datum.getCourseName()));
        }
    }

    private void fileIsExist() {
        File file = new File(workDir);
        if (!file.exists()) {
            throw new RuntimeException("工作空间work.dir不存在，请手动创建工作空间文件夹！");
        }
        if (!file.isDirectory()) {
            throw new RuntimeException("工作空间work.dir必须是一个文件夹！");
        }
    }

    private void setCommonValue(Map<String, String> map) {
        map.put("accept", "application/json, text/plain, */*");
        map.put("accept-Encoding", "gzip, deflate, br");
        map.put("accept-Language", "zh-CN,zh;q=0.9");
        map.put("authorization", "Bearer pc:fc76378101d925bdd9933fdf5811526f");
        map.put("connection", "keep-alive");
        map.put("cookie", cookie);
        map.put("origin", "https://learn.kaikeba.com");
        map.put("referer", "https://learn.kaikeba.com/");
        map.put("sec-ch-ua", "\".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
        map.put("sec-ch-ua-mobile", "?0");
        map.put("sec-ch-ua-platform", "\"Windows\"");
        map.put("sec-Fetch-Dest", "empty");
        map.put("sec-Fetch-Mode", "cors");
        map.put("sec-Fetch-Site", "same-site");
        map.put("user-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
    }

}
