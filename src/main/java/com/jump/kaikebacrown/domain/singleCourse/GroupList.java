package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 10:46:6
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class GroupList {

    @JsonProperty("group_id")
    private int groupId;
    @JsonProperty("section_id")
    private int sectionId;
    @JsonProperty("chapter_id")
    private int chapterId;
    @JsonProperty("course_id")
    private int courseId;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("is_whole")
    private int isWhole;

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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getIsWhole() {
        return isWhole;
    }

    public void setIsWhole(int isWhole) {
        this.isWhole = isWhole;
    }

}