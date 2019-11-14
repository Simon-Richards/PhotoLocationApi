
package com.ansur.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Credentials {

    @SerializedName("class")
    @Expose
    private Object _class;
    @SerializedName("apikey")
    @Expose
    private Object apikey;
    @SerializedName("username")
    @Expose
    private String username;

    public Object getClass_() {
        return _class;
    }

    public void setClass_(Object _class) {
        this._class = _class;
    }

    public Object getApikey() {
        return apikey;
    }

    public void setApikey(Object apikey) {
        this.apikey = apikey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
