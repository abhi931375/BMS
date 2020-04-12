package com.project.BMS.services;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EndUserService extends UserService{

    List<Movie> allMoviesForCity(String userName, String cityName);

    List<Theatre> allTheatresForMovie(String movieName);

    String bookTickets(String theatreName, int showNumber, int noOfTickets);
}
