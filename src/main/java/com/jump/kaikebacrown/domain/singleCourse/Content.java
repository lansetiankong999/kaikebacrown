package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 10:46:6
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Content {

    @JsonProperty("content_id")
    private int contentId;
    @JsonProperty("rank_num")
    private int rankNum;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getRankNum() {
        return rankNum;
    }

    public void setRankNum(int rankNum) {
        this.rankNum = rankNum;
    }

}