package com.project.BMS.repositories;

import com.project.BMS.models.dto.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT * FROM USERS WHERE USER_NAME = ?1", nativeQuery = true)
    User findByUserName(String userName);

    @Query(value = "SELECT id FROM USERS WHERE USER_NAME = ?1", nativeQuery = true)
    long getOwnerId(String userName);
}
