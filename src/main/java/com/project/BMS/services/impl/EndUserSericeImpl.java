package com.project.BMS.services.impl;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.services.EndUserService;

import java.util.List;

public class EndUserSericeImpl implements EndUserService {
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
        return null;
    }

    @Override
    public long getId(String userName) {
        return 0;
    }

    @Override
    public boolean isOwner(String userName) {
        return false;
    }
}
