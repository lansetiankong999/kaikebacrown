package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Auto-generated: 2022-06-30 10:46:6
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class ChapterList {

    @JsonProperty("chapter_id")
    private int chapterId;
    @JsonProperty("course_id")
    private int courseId;
    @JsonProperty("chapter_name")
    private String chapterName;
    @JsonProperty("rank_num")
    private int rankNum;
    @JsonProperty("hidden_chapter_num")
    private int hiddenChapterNum;
    @JsonProperty("is_locked")
    private int isLocked;
    private String intro;
    @JsonProperty("subscript_name")
    private String subscriptName;
    @JsonProperty("auth_status")
    private int authStatus;
    @JsonProperty("section_list")
    private List<SectionList> sectionList;
    private int progress;
    @JsonProperty("locked_desc")
    private String lockedDesc;
    @JsonProperty("is_hide_progress")
    private int isHideProgress;

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getRankNum() {
        return rankNum;
    }

    public void setRankNum(int rankNum) {
        this.rankNum = rankNum;
    }

    public int getHiddenChapterNum() {
        return hiddenChapterNum;
    }

    public void setHiddenChapterNum(int hiddenChapterNum) {
        this.hiddenChapterNum = hiddenChapterNum;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getSubscriptName() {
        return subscriptName;
    }

    public void setSubscriptName(String subscriptName) {
        this.subscriptName = subscriptName;
    }

    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }

    public List<SectionList> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<SectionList> sectionList) {
        this.sectionList = sectionList;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getLockedDesc() {
        return lockedDesc;
    }

    public void setLockedDesc(String lockedDesc) {
        this.lockedDesc = lockedDesc;
    }

    public int getIsHideProgress() {
        return isHideProgress;
    }

    public void setIsHideProgress(int isHideProgress) {
        this.isHideProgress = isHideProgress;
    }

}