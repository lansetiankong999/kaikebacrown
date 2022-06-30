package com.jump.kaikebacrown.domain.singleCourse;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Auto-generated: 2022-06-30 10:46:6
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
    private int status;
    private String type;
    @JsonProperty("cate_id")
    private int cateId;
    @JsonProperty("industry_id")
    private int industryId;
    private String intro;
    @JsonProperty("chapter_count")
    private int chapterCount;
    @JsonProperty("section_count")
    private int sectionCount;
    private String assistants;
    @JsonProperty("assistant_dispatch_type")
    private int assistantDispatchType;
    @JsonProperty("editor_uid")
    private int editorUid;
    @JsonProperty("introduce_url")
    private String introduceUrl;
    @JsonProperty("schedule_status")
    private int scheduleStatus;
    @JsonProperty("expect_section_num")
    private int expectSectionNum;
    @JsonProperty("start_date")
    private int startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("real_start_date")
    private String realStartDate;
    @JsonProperty("real_end_date")
    private String realEndDate;
    @JsonProperty("has_experiment")
    private boolean hasExperiment;
    @JsonProperty("education_id")
    private int educationId;
    @JsonProperty("source_course_id")
    private int sourceCourseId;
    @JsonProperty("is_auto_auth")
    private int isAutoAuth;
    @JsonProperty("is_no_login")
    private int isNoLogin;
    @JsonProperty("school_name")
    private String schoolName;
    @JsonProperty("chapter_list")
    private List<ChapterList> chapterList;
    private int progress;
    @JsonProperty("last_chapter")
    private int lastChapter;
    @JsonProperty("last_section")
    private int lastSection;
    @JsonProperty("expired_status")
    private int expiredStatus;
    @JsonProperty("last_info")
    private LastInfo lastInfo;
    @JsonProperty("is_open_thread")
    private int isOpenThread;
    @JsonProperty("etg_progress_hidden")
    private int etgProgressHidden;
    @JsonProperty("dept_type")
    private String deptType;
    @JsonProperty("is_hide_progress")
    private int isHideProgress;
    @JsonProperty("study_time")
    private int studyTime;
    @JsonProperty("experiment_id")
    private int experimentId;
    @JsonProperty("h5_experiment_detail")
    private String h5ExperimentDetail;
    @JsonProperty("recent_live")
    private RecentLive recentLive;
    @JsonProperty("has_scholarship")
    private int hasScholarship;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
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

    public String getAssistants() {
        return assistants;
    }

    public void setAssistants(String assistants) {
        this.assistants = assistants;
    }

    public int getAssistantDispatchType() {
        return assistantDispatchType;
    }

    public void setAssistantDispatchType(int assistantDispatchType) {
        this.assistantDispatchType = assistantDispatchType;
    }

    public int getEditorUid() {
        return editorUid;
    }

    public void setEditorUid(int editorUid) {
        this.editorUid = editorUid;
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

    public int getExpectSectionNum() {
        return expectSectionNum;
    }

    public void setExpectSectionNum(int expectSectionNum) {
        this.expectSectionNum = expectSectionNum;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRealStartDate() {
        return realStartDate;
    }

    public void setRealStartDate(String realStartDate) {
        this.realStartDate = realStartDate;
    }

    public String getRealEndDate() {
        return realEndDate;
    }

    public void setRealEndDate(String realEndDate) {
        this.realEndDate = realEndDate;
    }

    public boolean getHasExperiment() {
        return hasExperiment;
    }

    public void setHasExperiment(boolean hasExperiment) {
        this.hasExperiment = hasExperiment;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public int getSourceCourseId() {
        return sourceCourseId;
    }

    public void setSourceCourseId(int sourceCourseId) {
        this.sourceCourseId = sourceCourseId;
    }

    public int getIsAutoAuth() {
        return isAutoAuth;
    }

    public void setIsAutoAuth(int isAutoAuth) {
        this.isAutoAuth = isAutoAuth;
    }

    public int getIsNoLogin() {
        return isNoLogin;
    }

    public void setIsNoLogin(int isNoLogin) {
        this.isNoLogin = isNoLogin;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<ChapterList> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<ChapterList> chapterList) {
        this.chapterList = chapterList;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
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

    public int getExpiredStatus() {
        return expiredStatus;
    }

    public void setExpiredStatus(int expiredStatus) {
        this.expiredStatus = expiredStatus;
    }

    public LastInfo getLastInfo() {
        return lastInfo;
    }

    public void setLastInfo(LastInfo lastInfo) {
        this.lastInfo = lastInfo;
    }

    public int getIsOpenThread() {
        return isOpenThread;
    }

    public void setIsOpenThread(int isOpenThread) {
        this.isOpenThread = isOpenThread;
    }

    public int getEtgProgressHidden() {
        return etgProgressHidden;
    }

    public void setEtgProgressHidden(int etgProgressHidden) {
        this.etgProgressHidden = etgProgressHidden;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public int getIsHideProgress() {
        return isHideProgress;
    }

    public void setIsHideProgress(int isHideProgress) {
        this.isHideProgress = isHideProgress;
    }

    public int getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(int studyTime) {
        this.studyTime = studyTime;
    }

    public int getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(int experimentId) {
        this.experimentId = experimentId;
    }

    public String getH5ExperimentDetail() {
        return h5ExperimentDetail;
    }

    public void setH5ExperimentDetail(String h5ExperimentDetail) {
        this.h5ExperimentDetail = h5ExperimentDetail;
    }

    public RecentLive getRecentLive() {
        return recentLive;
    }

    public void setRecentLive(RecentLive recentLive) {
        this.recentLive = recentLive;
    }

    public int getHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(int hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

}