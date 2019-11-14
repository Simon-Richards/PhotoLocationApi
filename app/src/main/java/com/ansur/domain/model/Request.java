
package com.ansur.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("http_host")
    @Expose
    private String httpHost;
    @SerializedName("http_user_agent")
    @Expose
    private String httpUserAgent;
    @SerializedName("server_addr")
    @Expose
    private String serverAddr;
    @SerializedName("remote_addr")
    @Expose
    private String remoteAddr;
    @SerializedName("server_protocol")
    @Expose
    private String serverProtocol;
    @SerializedName("request_method")
    @Expose
    private String requestMethod;
    @SerializedName("request_uri")
    @Expose
    private String requestUri;
    @SerializedName("request_time")
    @Expose
    private Integer requestTime;

    public String getHttpHost() {
        return httpHost;
    }

    public void setHttpHost(String httpHost) {
        this.httpHost = httpHost;
    }

    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    public void setHttpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
    }

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getServerProtocol() {
        return serverProtocol;
    }

    public void setServerProtocol(String serverProtocol) {
        this.serverProtocol = serverProtocol;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public Integer getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
    }

}
