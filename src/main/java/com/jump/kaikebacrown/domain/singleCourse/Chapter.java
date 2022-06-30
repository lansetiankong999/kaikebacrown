package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 10:46:6
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Chapter {

    @JsonProperty("chapter_id")
    private int chapterId;
    @JsonProperty("rank_num")
    private int rankNum;

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getRankNum() {
        return rankNum;
    }

    public void setRankNum(int rankNum) {
        this.rankNum = rankNum;
    }

}