package com.project.BMS.models.dto;

public class Owner extends User {
    public Owner(String userName){
        this.userName = userName;
        this.isOwner = true;
    }

    public Owner(){}
}
