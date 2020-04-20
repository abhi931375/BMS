package com.project.BMS.models.dto;

public class Theatre {
    private long id;
    private String theatreName;
    private String cityName;
//    private Seat seats;
    private int totalNoOfShows;
    private int ownerId;

    public Theatre(){}

    public Theatre(String theatreName, String cityName, int totalNoOfShows, int ownerId) {
        this.theatreName = theatreName;
        this.cityName = cityName;
        this.totalNoOfShows = totalNoOfShows;
//        this.seats = seats;
        this.ownerId = ownerId;
    }

    public int getOwnerId() { return ownerId; }

    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public int getTotalNoOfShows() { return totalNoOfShows; }

    public void setTotalNoOfShows(int totalNoOfShows) { this.totalNoOfShows = totalNoOfShows; }

//    public Seat getTotalSeats() { return seats; }
//
//    public void setTotalSeats(Seat seats) { this.seats = seats; }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getCityName() { return cityName;}

    public void setCity(String cityName) {
        this.cityName = cityName;
    }
}
