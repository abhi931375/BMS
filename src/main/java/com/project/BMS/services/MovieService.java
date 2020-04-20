package com.project.BMS.services;

import com.project.BMS.models.dto.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface MovieService {
    public String addMovie(Movie movie);

    public List<String> moviesForCity(String cityName);

//    public List<Movie> listMovies();
//
//    public List<Movie> listMoviesByCity();
}
