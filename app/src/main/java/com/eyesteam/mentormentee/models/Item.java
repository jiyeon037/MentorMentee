package com.eyesteam.mentormentee.models;

public class Item {
    String UserId;
    String UserPw;
    String message;
    int responseCode;

    public String getUserId() {
        return UserId;
    }

    public String getUserPw() {
        return UserPw;
    }

    public String getMessage() {
        return message;
    }

    public int getResponseCode() {
        return responseCode;
    }
}
