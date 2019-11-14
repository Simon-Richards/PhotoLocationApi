
package com.ansur.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotosResponse {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("meta")
    @Expose
    private Meta_ meta;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Meta_ getMeta() {
        return meta;
    }

    public void setMeta(Meta_ meta) {
        this.meta = meta;
    }

}
