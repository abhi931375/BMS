package com.project.BMS.services;

//import com.project.BMS.models.Show;
import com.project.BMS.models.Theatre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TheatreService {

    void addTheatre(Theatre theatre);

    List<Theatre> getTheatresByCity(String cityName);
//
//    public void addShows(List<Show> shows);
//
//    public void addShow(Show show);
}

