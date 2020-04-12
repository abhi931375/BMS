package com.project.BMS.models.dto;

import com.project.BMS.models.Seat;

public class Theatre {
    private long id;
    private String theatreName;
    private String cityName;
    private Seat totalSeats;
    private int totalNoOfShows;

    public Theatre(){}

    public Theatre(String theatreName, String cityName, int totalNoOfShows) {
        this.theatreName = theatreName;
        this.cityName = cityName;
        this.totalNoOfShows = totalNoOfShows;
    }

    public int getTotalNoOfShows() { return totalNoOfShows; }

    public void setTotalNoOfShows(int totalNoOfShows) { this.totalNoOfShows = totalNoOfShows; }

    public Seat getTotalSeats() { return totalSeats; }

    public void setTotalSeats(Seat totalSeats) { this.totalSeats = totalSeats; }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getCityId() { return cityName;}

    public void setCity(String cityName) {
        this.cityName = cityName;
    }
}
