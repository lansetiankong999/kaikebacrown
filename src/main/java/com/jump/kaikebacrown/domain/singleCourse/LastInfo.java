package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 10:46:6
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class LastInfo {

    @JsonProperty("course_id")
    private int courseId;
    @JsonProperty("location_desc")
    private String locationDesc;
    private Chapter chapter;
    private Section section;
    private Content content;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}