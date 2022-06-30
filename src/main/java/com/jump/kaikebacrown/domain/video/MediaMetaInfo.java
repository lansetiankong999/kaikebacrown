/**
  * Copyright 2022 bejson.com 
  */
package com.jump.kaikebacrown.domain.video;
import java.util.List;

/**
 * Auto-generated: 2022-06-30 16:12:36
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class MediaMetaInfo {

    private List<VideoGroup> videoGroup;
    private List<ImageGroup> imageGroup;
    public void setVideoGroup(List<VideoGroup> videoGroup) {
         this.videoGroup = videoGroup;
     }
     public List<VideoGroup> getVideoGroup() {
         return videoGroup;
     }

    public void setImageGroup(List<ImageGroup> imageGroup) {
         this.imageGroup = imageGroup;
     }
     public List<ImageGroup> getImageGroup() {
         return imageGroup;
     }

}