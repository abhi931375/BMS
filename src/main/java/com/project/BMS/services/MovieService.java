package com.project.BMS.services;

import com.project.BMS.models.Movie;
import com.project.BMS.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface MovieService {
    public void addMovie(Movie movie);

    public List<Movie> listMovies();

    public List<Movie> listMoviesByCity();
}
