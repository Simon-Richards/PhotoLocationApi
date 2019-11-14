
package com.ansur.domain.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta_ {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("feedback")
    @Expose
    private List<Object> feedback = null;
    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("credentials")
    @Expose
    private Credentials credentials;
    @SerializedName("time_epoch")
    @Expose
    private Integer timeEpoch;
    @SerializedName("time_local")
    @Expose
    private String timeLocal;
    @SerializedName("version")
    @Expose
    private Double version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<Object> feedback) {
        this.feedback = feedback;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public Integer getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(Integer timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTimeLocal() {
        return timeLocal;
    }

    public void setTimeLocal(String timeLocal) {
        this.timeLocal = timeLocal;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

}
