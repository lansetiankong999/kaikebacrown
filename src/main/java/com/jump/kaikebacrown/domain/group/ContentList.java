package com.jump.kaikebacrown.domain.group;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Auto-generated: 2022-06-30 11:41:28
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class ContentList {

    @JsonProperty("content_id")
    private int contentId;
    @JsonProperty("group_id")
    private int groupId;
    @JsonProperty("section_id")
    private int sectionId;
    @JsonProperty("chapter_id")
    private int chapterId;
    @JsonProperty("course_id")
    private int courseId;
    @JsonProperty("content_title")
    private String contentTitle;
    @JsonProperty("content_type")
    private int contentType;
    private List<Content> content;
    @JsonProperty("rank_num")
    private int rankNum;
    @JsonProperty("is_test")
    private int isTest;
    @JsonProperty("is_locked")
    private int isLocked;
    private int progress;
    @JsonProperty("locked_desc")
    private String lockedDesc;
    @JsonProperty("is_hide_progress")
    private int isHideProgress;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

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

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public int getRankNum() {
        return rankNum;
    }

    public void setRankNum(int rankNum) {
        this.rankNum = rankNum;
    }

    public int getIsTest() {
        return isTest;
    }

    public void setIsTest(int isTest) {
        this.isTest = isTest;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
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

    @Override
    public String toString() {
        return "ContentList{" +
                "contentId=" + contentId +
                ", groupId=" + groupId +
                ", sectionId=" + sectionId +
                ", chapterId=" + chapterId +
                ", courseId=" + courseId +
                ", contentTitle='" + contentTitle + '\'' +
                ", contentType=" + contentType +
                ", content=" + content +
                ", rankNum=" + rankNum +
                ", isTest=" + isTest +
                ", isLocked=" + isLocked +
                ", progress=" + progress +
                ", lockedDesc='" + lockedDesc + '\'' +
                ", isHideProgress=" + isHideProgress +
                '}';
    }
}