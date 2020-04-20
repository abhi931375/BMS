package com.project.BMS.models.dto;

public class User {
    protected long id;
    protected String userName; //Named it userName instead of name as it should be unique for owners who register
    protected boolean isOwner;

    public User(){}

    public User(String userName, boolean isOwner) {
        this.userName = userName;
        this.isOwner = isOwner;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }

    public long getId() { return id; }
}
