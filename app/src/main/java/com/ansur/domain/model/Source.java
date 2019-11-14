
package com.ansur.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("camera_make")
    @Expose
    private Object cameraMake;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("camera_model")
    @Expose
    private Object cameraModel;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Object getCameraMake() {
        return cameraMake;
    }

    public void setCameraMake(Object cameraMake) {
        this.cameraMake = cameraMake;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Object getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(Object cameraModel) {
        this.cameraModel = cameraModel;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}
