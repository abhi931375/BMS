package com.project.BMS.repositories;

import com.project.BMS.models.User;
import com.project.BMS.models.dto.EndUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EndUserRepository extends CrudRepository<EndUser, Long> {

    @Query(value = "SELECT * FROM USERS WHERE USER_NAME = ?1", nativeQuery = true)
    User findByUserName(String userName);
}
