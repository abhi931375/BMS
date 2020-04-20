package com.project.BMS.services.impl;

import com.project.BMS.models.dto.City;
import com.project.BMS.repositories.CityRepository;
import com.project.BMS.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    @Override
    public City getCityIdByName(String cityName) {
        return null;
    }

    @Override
    public int getCityNameById(int id) {
        return 0;
    }

    @Override
    public boolean checkCityExists(String cityName) {
        return false;
    }

    @Override
    public void addCity(String cityName) {
        return;
    }

    @Override
    public List<String> getAllCityNamesByIds(List<Long> cityIds) {
        return cityRepository.getAllCityNamesByIds(cityIds);
    }

    @Override
    public List<String> getAllCityNames() {
        return cityRepository.getAllCityNames();
    }
}
