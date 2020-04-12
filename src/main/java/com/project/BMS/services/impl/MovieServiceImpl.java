package com.project.BMS.services.impl;

import com.project.BMS.models.Movie;
import com.project.BMS.repositories.MovieRepository;
import com.project.BMS.services.MovieService;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> listMovies() {
//        return movieRepository.findAll();
        return new ArrayList<Movie>();
    }

    @Override
    public List<Movie> listMoviesByCity() {
        return null;
    }
}
