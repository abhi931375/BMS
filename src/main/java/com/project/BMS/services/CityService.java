package com.project.BMS.services;

import com.project.BMS.models.dto.City;
import com.project.BMS.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    City getCityIdByName(String cityName);

    int getCityNameById(int id);

    boolean checkCityExists(String cityName);

    void addCity(String cityName);

    List<String> getAllCityNamesByIds(List<Long> cityIds);

    List<String> getAllCityNames();
}
