package com.jump.kaikebacrown.domain.list;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 10:22:47
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Data {

    @JsonProperty("course_id")
    private int courseId;
    @JsonProperty("course_name")
    private String courseName;
    @JsonProperty("cover_img_path_web")
    private String coverImgPathWeb;
    @JsonProperty("cover_img_path_mobile")
    private String coverImgPathMobile;
    @JsonProperty("school_id")
    private int schoolId;
    private String type;
    private String intro;
    @JsonProperty("chapter_count")
    private int chapterCount;
    @JsonProperty("section_count")
    private int sectionCount;
    @JsonProperty("introduce_url")
    private String introduceUrl;
    @JsonProperty("schedule_status")
    private int scheduleStatus;
    @JsonProperty("dept_type")
    private String deptType;
    @JsonProperty("has_live")
    private boolean hasLive;
    @JsonProperty("is_hide_progress")
    private int isHideProgress;
    @JsonProperty("expired_at")
    private String expiredAt;
    @JsonProperty("expired_status")
    private int expiredStatus;
    @JsonProperty("course_icon")
    private String courseIcon;
    @JsonProperty("last_chapter")
    private int lastChapter;
    @JsonProperty("last_section")
    private int lastSection;
    @JsonProperty("recent_live")
    private RecentLive recentLive;
    @JsonProperty("recent_live_time")
    private String recentLiveTime;
    @JsonProperty("last_info")
    private LastInfo lastInfo;
    @JsonProperty("study_progress")
    private int studyProgress;
    @JsonProperty("etg_progress_hidden")
    private int etgProgressHidden;
    @JsonProperty("last_study_time")
    private String lastStudyTime;
    @JsonProperty("add_student_time")
    private String addStudentTime;
    @JsonProperty("homework_commit_num")
    private int homeworkCommitNum;
    @JsonProperty("ask_commit_num")
    private int askCommitNum;
    @JsonProperty("course_study_time")
    private int courseStudyTime;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoverImgPathWeb() {
        return coverImgPathWeb;
    }

    public void setCoverImgPathWeb(String coverImgPathWeb) {
        this.coverImgPathWeb = coverImgPathWeb;
    }

    public String getCoverImgPathMobile() {
        return coverImgPathMobile;
    }

    public void setCoverImgPathMobile(String coverImgPathMobile) {
        this.coverImgPathMobile = coverImgPathMobile;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String getIntroduceUrl() {
        return introduceUrl;
    }

    public void setIntroduceUrl(String introduceUrl) {
        this.introduceUrl = introduceUrl;
    }

    public int getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(int scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public boolean getHasLive() {
        return hasLive;
    }

    public void setHasLive(boolean hasLive) {
        this.hasLive = hasLive;
    }

    public int getIsHideProgress() {
        return isHideProgress;
    }

    public void setIsHideProgress(int isHideProgress) {
        this.isHideProgress = isHideProgress;
    }

    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public int getExpiredStatus() {
        return expiredStatus;
    }

    public void setExpiredStatus(int expiredStatus) {
        this.expiredStatus = expiredStatus;
    }

    public String getCourseIcon() {
        return courseIcon;
    }

    public void setCourseIcon(String courseIcon) {
        this.courseIcon = courseIcon;
    }

    public int getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(int lastChapter) {
        this.lastChapter = lastChapter;
    }

    public int getLastSection() {
        return lastSection;
    }

    public void setLastSection(int lastSection) {
        this.lastSection = lastSection;
    }

    public RecentLive getRecentLive() {
        return recentLive;
    }

    public void setRecentLive(RecentLive recentLive) {
        this.recentLive = recentLive;
    }

    public String getRecentLiveTime() {
        return recentLiveTime;
    }

    public void setRecentLiveTime(String recentLiveTime) {
        this.recentLiveTime = recentLiveTime;
    }

    public LastInfo getLastInfo() {
        return lastInfo;
    }

    public void setLastInfo(LastInfo lastInfo) {
        this.lastInfo = lastInfo;
    }

    public int getStudyProgress() {
        return studyProgress;
    }

    public void setStudyProgress(int studyProgress) {
        this.studyProgress = studyProgress;
    }

    public int getEtgProgressHidden() {
        return etgProgressHidden;
    }

    public void setEtgProgressHidden(int etgProgressHidden) {
        this.etgProgressHidden = etgProgressHidden;
    }

    public String getLastStudyTime() {
        return lastStudyTime;
    }

    public void setLastStudyTime(String lastStudyTime) {
        this.lastStudyTime = lastStudyTime;
    }

    public String getAddStudentTime() {
        return addStudentTime;
    }

    public void setAddStudentTime(String addStudentTime) {
        this.addStudentTime = addStudentTime;
    }

    public int getHomeworkCommitNum() {
        return homeworkCommitNum;
    }

    public void setHomeworkCommitNum(int homeworkCommitNum) {
        this.homeworkCommitNum = homeworkCommitNum;
    }

    public int getAskCommitNum() {
        return askCommitNum;
    }

    public void setAskCommitNum(int askCommitNum) {
        this.askCommitNum = askCommitNum;
    }

    public int getCourseStudyTime() {
        return courseStudyTime;
    }

    public void setCourseStudyTime(int courseStudyTime) {
        this.courseStudyTime = courseStudyTime;
    }

}