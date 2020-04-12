package com.project.BMS.models.dto;

public class EndUser extends User {
    public EndUser(String userName){
        this.userName = userName;
        this.isOwner = false;
    }

    public EndUser(){}
}
