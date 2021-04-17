package com.ligaofei.springbootxdtest.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 请求体
 */
public class VideoOrderRequest {


    @JsonProperty("video_id")//前端传过来的
    private int videoId;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
}
