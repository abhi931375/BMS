package com.project.BMS.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService{
    String register(String userName);

    long getId(String userName);

    boolean isOwner(String userName);
}
