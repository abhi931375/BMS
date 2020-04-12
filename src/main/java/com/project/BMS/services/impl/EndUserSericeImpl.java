package com.project.BMS.services.impl;

import com.project.BMS.models.dto.EndUser;
import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.repositories.EndUserRepository;
import com.project.BMS.services.EndUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EndUserSericeImpl implements EndUserService {
    private EndUser endUser;
    @Autowired
    private EndUserRepository endUserRepository;

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
    public boolean isUserNamePresent(String userName) {
        return false;
    }

    @Override
    public String register(String userName) {
        endUserRepository
        EndUser t = endUserRepository.save(new EndUser(userName));
    }

    @Override
    public long getId(String userName) {
        return endUser.getId(userName);
    }

    @Override
    public boolean isOwner(String userName) {
        return false;
    }
}
