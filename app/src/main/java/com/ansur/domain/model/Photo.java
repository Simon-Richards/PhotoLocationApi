
package com.ansur.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("signature")
    @Expose
    private String signature;
    @SerializedName("instant")
    @Expose
    private String instant;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("location_latitude")
    @Expose
    private Double locationLatitude;
    @SerializedName("location_longitude")
    @Expose
    private Double locationLongitude;
    @SerializedName("location_time")
    @Expose
    private String locationTime;
    @SerializedName("location_accuracy")
    @Expose
    private Object locationAccuracy;
    @SerializedName("location_altitude")
    @Expose
    private Object locationAltitude;
    @SerializedName("location_provider")
    @Expose
    private String locationProvider;
    @SerializedName("mission_id")
    @Expose
    private Object missionId;
    @SerializedName("mission_name")
    @Expose
    private Object missionName;
    @SerializedName("thumbnail_hash")
    @Expose
    private String thumbnailHash;
    @SerializedName("preview_hash")
    @Expose
    private String previewHash;
    @SerializedName("category_id")
    @Expose
    private Object categoryId;
    @SerializedName("category_name")
    @Expose
    private Object categoryName;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user_username")
    @Expose
    private String userUsername;
    @SerializedName("user_color")
    @Expose
    private String userColor;
    @SerializedName("observation_url")
    @Expose
    private String observationUrl;
    @SerializedName("preview_url")
    @Expose
    private String previewUrl;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getInstant() {
        return instant;
    }

    public void setInstant(String instant) {
        this.instant = instant;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(Double locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public Double getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(Double locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public String getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(String locationTime) {
        this.locationTime = locationTime;
    }

    public Object getLocationAccuracy() {
        return locationAccuracy;
    }

    public void setLocationAccuracy(Object locationAccuracy) {
        this.locationAccuracy = locationAccuracy;
    }

    public Object getLocationAltitude() {
        return locationAltitude;
    }

    public void setLocationAltitude(Object locationAltitude) {
        this.locationAltitude = locationAltitude;
    }

    public String getLocationProvider() {
        return locationProvider;
    }

    public void setLocationProvider(String locationProvider) {
        this.locationProvider = locationProvider;
    }

    public Object getMissionId() {
        return missionId;
    }

    public void setMissionId(Object missionId) {
        this.missionId = missionId;
    }

    public Object getMissionName() {
        return missionName;
    }

    public void setMissionName(Object missionName) {
        this.missionName = missionName;
    }

    public String getThumbnailHash() {
        return thumbnailHash;
    }

    public void setThumbnailHash(String thumbnailHash) {
        this.thumbnailHash = thumbnailHash;
    }

    public String getPreviewHash() {
        return previewHash;
    }

    public void setPreviewHash(String previewHash) {
        this.previewHash = previewHash;
    }

    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Object getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Object categoryName) {
        this.categoryName = categoryName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserColor() {
        return userColor;
    }

    public void setUserColor(String userColor) {
        this.userColor = userColor;
    }

    public String getObservationUrl() {
        return observationUrl;
    }

    public void setObservationUrl(String observationUrl) {
        this.observationUrl = observationUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}
