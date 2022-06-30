package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Auto-generated: 2022-06-30 10:46:6
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class SectionList {

    @JsonProperty("section_id")
    private int sectionId;
    @JsonProperty("chapter_id")
    private int chapterId;
    @JsonProperty("course_id")
    private int courseId;
    @JsonProperty("section_name")
    private String sectionName;
    @JsonProperty("hidden_section_num")
    private int hiddenSectionNum;
    @JsonProperty("rank_num")
    private int rankNum;
    @JsonProperty("subscript_name")
    private String subscriptName;
    @JsonProperty("is_locked")
    private int isLocked;
    @JsonProperty("group_list")
    private List<GroupList> groupList;
    private int progress;
    @JsonProperty("locked_desc")
    private String lockedDesc;
    @JsonProperty("is_hide_progress")
    private int isHideProgress;

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

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getHiddenSectionNum() {
        return hiddenSectionNum;
    }

    public void setHiddenSectionNum(int hiddenSectionNum) {
        this.hiddenSectionNum = hiddenSectionNum;
    }

    public int getRankNum() {
        return rankNum;
    }

    public void setRankNum(int rankNum) {
        this.rankNum = rankNum;
    }

    public String getSubscriptName() {
        return subscriptName;
    }

    public void setSubscriptName(String subscriptName) {
        this.subscriptName = subscriptName;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    public List<GroupList> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<GroupList> groupList) {
        this.groupList = groupList;
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