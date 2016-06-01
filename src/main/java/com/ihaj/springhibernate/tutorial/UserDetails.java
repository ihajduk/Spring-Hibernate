package com.ihaj.springhibernate.tutorial;

/**
 * Created by iniu on 2016-05-18.
 */
public class UserDetails {
    private long userId;
    private String userName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
