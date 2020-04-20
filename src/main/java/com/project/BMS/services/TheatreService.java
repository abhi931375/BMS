package com.project.BMS.services;

//import com.project.BMS.models.Show;
import com.project.BMS.models.dto.Theatre;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TheatreService {

    String addTheatre(Theatre theatre); 

    List<Theatre> getTheatresByCity(String cityName);

    List<Long> getCityIdsForOwner(Long ownerId);
}

