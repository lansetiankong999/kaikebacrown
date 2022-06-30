package com.jump.kaikebacrown.domain.group;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 11:41:28
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Content {

    @JsonProperty("video_id")
    private int videoId;
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
    @JsonProperty("video_vendor")
    private int videoVendor;
    private int status;
    private int duration;
    @JsonProperty("file_size")
    private int fileSize;
    private String image;
    @JsonProperty("callback_key")
    private String callbackKey;
    private int hide;
    @JsonProperty("support_free_see")
    private int supportFreeSee;
    @JsonProperty("support_free_see_type")
    private int supportFreeSeeType;
    @JsonProperty("is_signin")
    private int isSignin;
    @JsonProperty("attach_id")
    private int attachId;
    private String key;
    @JsonProperty("material_id")
    private int materialId;
    private String name;
    private int size;
    private String url;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

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

    public int getVideoVendor() {
        return videoVendor;
    }

    public void setVideoVendor(int videoVendor) {
        this.videoVendor = videoVendor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCallbackKey() {
        return callbackKey;
    }

    public void setCallbackKey(String callbackKey) {
        this.callbackKey = callbackKey;
    }

    public int getHide() {
        return hide;
    }

    public void setHide(int hide) {
        this.hide = hide;
    }

    public int getSupportFreeSee() {
        return supportFreeSee;
    }

    public void setSupportFreeSee(int supportFreeSee) {
        this.supportFreeSee = supportFreeSee;
    }

    public int getSupportFreeSeeType() {
        return supportFreeSeeType;
    }

    public void setSupportFreeSeeType(int supportFreeSeeType) {
        this.supportFreeSeeType = supportFreeSeeType;
    }

    public int getIsSignin() {
        return isSignin;
    }

    public void setIsSignin(int isSignin) {
        this.isSignin = isSignin;
    }

    public int getAttachId() {
        return attachId;
    }

    public void setAttachId(int attachId) {
        this.attachId = attachId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Content{" +
                "videoId=" + videoId +
                ", contentId=" + contentId +
                ", groupId=" + groupId +
                ", sectionId=" + sectionId +
                ", chapterId=" + chapterId +
                ", courseId=" + courseId +
                ", videoVendor=" + videoVendor +
                ", status=" + status +
                ", duration=" + duration +
                ", fileSize=" + fileSize +
                ", image='" + image + '\'' +
                ", callbackKey='" + callbackKey + '\'' +
                ", hide=" + hide +
                ", supportFreeSee=" + supportFreeSee +
                ", supportFreeSeeType=" + supportFreeSeeType +
                ", isSignin=" + isSignin +
                '}';
    }
}