/**
 * Copyright 2022 bejson.com
 */
package com.jump.kaikebacrown.domain.video;

import java.util.Date;

/**
 * Auto-generated: 2022-06-30 16:12:36
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private String mediaId;
    private String tenantId;
    private String spaceName;
    private int status;
    private String title;
    private int source;
    private int mediaType;
    private MediaMetaInfo mediaMetaInfo;

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getSource() {
        return source;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaMetaInfo(MediaMetaInfo mediaMetaInfo) {
        this.mediaMetaInfo = mediaMetaInfo;
    }

    public MediaMetaInfo getMediaMetaInfo() {
        return mediaMetaInfo;
    }

}