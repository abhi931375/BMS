package com.project.BMS.services.impl;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.models.dto.User;
import com.project.BMS.repositories.OwnerRepository;
import com.project.BMS.services.CityService;
import com.project.BMS.services.MovieService;
import com.project.BMS.services.OwnerService;
import com.project.BMS.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;
    private CityService cityService;
    private MovieService movieService;
    private TheatreService theatreService;

    private boolean checkOwnerExists(String userName){
        User owner = ownerRepository.findByUserName(userName);
        if (owner == null)
            return false;
        if (owner.isOwner() == false)
            return false;
        return true;
    }

    @Override
    public String addTheatre(String userName, Theatre theatre) {
        if (!checkOwnerExists(userName))
            theatreService.addTheatre(theatre);
        return "Owner " + userName + " does not exist in our database. Please register yourself first";
    }

    @Override
    public String addTheatres(String userName, List<Theatre> theatres) {
        if (!checkOwnerExists(userName)){
            for(int i=0; i<theatres.size(); i++)
                theatreService.addTheatre(theatres.get(i));
        }
        return "Owner " + userName + " does not exist in our database. Please register yourself first";
    }

    @Override
    public String addMovie(String userName, Movie movie) {
        if (!checkOwnerExists(userName))
            movieService.addMovie(movie);
        return "Owner " + userName + " does not exist in our database. Please register yourself first";
    }

    @Override
    public String addMovies(String userName, List<Movie> movies) {
        if (!checkOwnerExists(userName)){
            for(int i=0; i<movies.size(); i++)
                movieService.addMovie(movies.get(i));
        }
        return "Owner " + userName + " does not exist in our database. Please register yourself first";
    }

    @Override
    public List<String> listCities(String userName) {
        List<String> res = new ArrayList<>();
        long ownerId = ownerRepository.getOwnerId(userName);
        if (ownerId > 0){
            List<Long> cityIds = theatreService.getCityIdsForOwner(ownerId);
            if (cityIds.size() == 0)
                res.add("There are no theatres for owner" + userName + "in any city.");
            else
                res = cityService.getAllCityNamesByIds(cityIds);
        }
        else
            res.add("Owner " + userName + " does not exist in our database. Please register yourself first to see the cities your theatres are in.");
        return res;
    }

    @Override
    public String register(String userName) {
        if (checkOwnerExists(userName)) {
            ownerRepository.save(new User(userName, true));
            return "Owner " + userName + " is now registered.";
        }
        return "Owner " + userName + " already exists.";
    }

    @Override
    public long getId(String userName) {
        return ownerRepository.getOwnerId(userName);
    }

    @Override
    public boolean isOwner(String userName) {
        return false;
    }
}
