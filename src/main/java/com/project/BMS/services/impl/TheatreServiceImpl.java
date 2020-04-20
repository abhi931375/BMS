package com.project.BMS.services.impl;

import com.project.BMS.models.dto.City;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.repositories.CityRepository;
import com.project.BMS.repositories.TheatreRepository;
import com.project.BMS.services.CityService;
import com.project.BMS.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TheatreServiceImpl implements TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;
    private CityService cityService;

    public String addTheatre(Theatre theatre) {
        String theatreName = theatre.getTheatreName();
        if (theatreRepository.findByTheatreName(theatreName) == null) {
            theatreRepository.save(theatre);
            cityService.addCity(theatre.getCityName());
            return "Theatre " + theatreName + " is successfullly added.";
        }
        return "Theatre " + theatreName + " is already present.";
    }

    @Override
    public List<Theatre> getTheatresByCity(String cityName) {
        return null;
    }

    @Override
    public List<Long> getCityIdsForOwner(Long ownerId) {
        return theatreRepository.getCityIds(ownerId);
    }

}
