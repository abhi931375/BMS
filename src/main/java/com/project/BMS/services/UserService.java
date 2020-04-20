package com.project.BMS.services;

import com.project.BMS.models.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService{

//    List<User> findByUserName(String userName);

    String register(String userName);

    long getId(String userName);

    boolean isOwner(String userName);
}
