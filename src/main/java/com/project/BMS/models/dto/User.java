package com.project.BMS.models.dto;

import java.util.List;

public abstract class User {
    protected long id;
    protected String userName; //Named it userName instead of name as it should be unique for owners who register
    protected boolean isOwner;

    public abstract String register(String userName);

    public long getId(String userName){
        return id;
    }

    public boolean isOwner(String userName){
        return isOwner;
    }

    public abstract String addTheatre(String userName, Theatre theatre);

    public abstract String addTheatres(String userName, List<Theatre> theatres);

    public abstract String addMovie(String userName, Movie movie);

    public abstract String addMovies(String userName, List<Movie> movies);

    public abstract List<String> listCities(String userName);

    public abstract List<Movie> allMoviesForCity(String userName, String cityName);

    public abstract List<Theatre> allTheatresForMovie(String movieName);

    public abstract String bookTickets(String theatreName, int showNumber, int noOfTickets);
}
