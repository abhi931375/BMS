package com.project.BMS.repositories;

import com.project.BMS.models.dto.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Integer> {

    @Query(value = "SELECT DISTINCT(NAME) FROM CITY", nativeQuery = true)
    List<String> getAllCityNames();

    @Query(value = "SELECT NAME FROM CITY where ID IN ?1", nativeQuery = true)
    List<String> getAllCityNamesByIds(List<Long> cityIds);
}
