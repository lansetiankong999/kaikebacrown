/**
  * Copyright 2022 bejson.com 
  */
package com.jump.kaikebacrown.domain.video;

/**
 * Auto-generated: 2022-06-30 16:12:36
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ImageGroup {

    private String imageId;
    private String type;
    private String bucketName;
    private String objectName;
    private boolean coverImage;
    private String showURL;
    public void setImageId(String imageId) {
         this.imageId = imageId;
     }
     public String getImageId() {
         return imageId;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setBucketName(String bucketName) {
         this.bucketName = bucketName;
     }
     public String getBucketName() {
         return bucketName;
     }

    public void setObjectName(String objectName) {
         this.objectName = objectName;
     }
     public String getObjectName() {
         return objectName;
     }

    public void setCoverImage(boolean coverImage) {
         this.coverImage = coverImage;
     }
     public boolean getCoverImage() {
         return coverImage;
     }

    public void setShowURL(String showURL) {
         this.showURL = showURL;
     }
     public String getShowURL() {
         return showURL;
     }

}