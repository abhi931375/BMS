package com.project.BMS.models.dto;

import java.util.List;

public class Owner extends User {
    private boolean isOwner = true;

    @Override
    public String register(String userName) {
        //TODO
        return null;
    }

    @Override
    public String addTheatre(String userName, Theatre theatre) {
        //TODO
        return null;
    }

    @Override
    public String addTheatres(String userName, List<Theatre> theatres) {
        //TODO
        return null;
    }

    @Override
    public String addMovie(String userName, Movie movie) {
        //TODO
        return null;
    }

    @Override
    public String addMovies(String userName, List<Movie> movies) {
        //TODO
        return null;
    }

    @Override
    public List<String> listCities(String userName) {
        //TODO
        return null;
    }

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
}
