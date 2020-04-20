package com.project.BMS.services.impl;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.repositories.MovieRepository;
import com.project.BMS.repositories.TheatreRepository;
import com.project.BMS.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private TheatreRepository theatreRepository;

    @Override
    public String addMovie(Movie movie) {
        String movieName = movie.getName();
        String theatreName = movie.getTheatreName();
        if (!movieRepository.movieByMovieAndTheatreName(movieName, theatreName)) {
            if (theatreRepository.theatresByTheatreName(theatreName)) {
                movieRepository.save(movie);
                return "Movie " + movie + " added successfully.";
            }
            return "Theatre " + theatreName + " does not exist. Please add theatre first.";
        }
        return "Movie " + movieName + " is already present in the theatre " + theatreName;
    }

    @Override
    public List<String> moviesForCity(String cityName) {
        return null;
    }

//    @Override
//    public List<Movie> listMovies() {
////        return movieRepository.findAll();
//        return new ArrayList<Movie>();
//    }
//
//    @Override
//    public List<Movie> listMoviesByCity() {
//        return null;
//    }
}
