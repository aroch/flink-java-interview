package com.walkme.data.streaming.ex1.model;

public class WalkMeEvent {

    public WalkMeEvent() {
    }

    public WalkMeEvent(Long time, String userId) {
        this.time = time;
        this.userId = userId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private Long time;
    private String userId;

}
