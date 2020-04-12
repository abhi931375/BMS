package com.project.BMS.models.dto;

import java.util.List;

public class EndUser extends User {
    private boolean isOwner = false;

    @Override
    public String register(String userName) {
        return null;
    }

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
    public List<Movie> allMoviesForCity(String userName, String cityName) {
        //TODO
        return null;
    }

    @Override
    public List<Theatre> allTheatresForMovie(String movieName) {
        //TODO
        return null;
    }

    @Override
    public String bookTickets(String theatreName, int showNumber, int noOfTickets) {
        //TODO
        return null;
    }
}
