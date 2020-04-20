package com.project.BMS.services.impl;

import com.project.BMS.models.User;
import com.project.BMS.models.dto.EndUser;
import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.repositories.EndUserRepository;
import com.project.BMS.services.EndUserService;
import com.project.BMS.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EndUserServiceImpl implements EndUserService {
    private EndUser endUser;
    @Autowired
    private EndUserRepository endUserRepository;
    private MovieService movieService;

    @Override
    public List<Movie> allMoviesForCity(String userName, String cityName) {
        return null;
    }

    @Override
    public List<Theatre> allTheatresForMovie(String movieName) {
        return null;
    }

    @Override
    public String bookTickets(String theatreName, int showNumber, int noOfTickets) {
        return null;
    }

    @Override
    public String register(String userName) {
        if (endUserRepository.save(new EndUser(userName)) != null)
            return "Hi " + userName + " , you can now book your tickets from our BMS platform.";
        return userName + " is already taken, please enter a new unique userName";
    }

    @Override
    public long getId(String userName) {
        return 0;
    }

    @Override
    public boolean isOwner(String userName) {
        return false;
    }

    @Override
    public List<String> moviesForCity(String cityName) {
        return movieService.moviesForCity(cityName);
    }
}
