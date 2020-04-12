package com.project.BMS.services;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OwnerService extends UserService {

    String addTheatre(String userName, Theatre theatre);

    String addTheatres(String userName, List<Theatre> theatres);

    String addMovie(String userName, Movie movie);

    String addMovies(String userName, List<Movie> movies);

    List<String> listCities(String userName);
}
