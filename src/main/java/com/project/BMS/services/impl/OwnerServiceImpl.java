package com.project.BMS.services.impl;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.repositories.OwnerRepository;
import com.project.BMS.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public String addTheatre(String userName, Theatre theatre) {
        return null;
    }

    @Override
    public String addTheatres(String userName, List<Theatre> theatres) {
        return null;
    }

    @Override
    public String addMovie(String userName, Movie movie) {
        return null;
    }

    @Override
    public String addMovies(String userName, List<Movie> movies) {
        return null;
    }

    @Override
    public List<String> listCities(String userName) {
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
