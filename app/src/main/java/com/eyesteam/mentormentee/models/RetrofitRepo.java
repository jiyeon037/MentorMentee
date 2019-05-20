package com.eyesteam.mentormentee.models;

import java.util.List;

public class RetrofitRepo {

    String UserId;
    String UserPw;

    public RetrofitRepo(String userId, String userPw) {
        UserId = userId;
        UserPw = userPw;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserPw() {
        return UserPw;
    }


/*    List<Item> info;

    public List<Item> getInfo(){
        return info;
    }*/
}
