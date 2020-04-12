package com.project.BMS.models.dto;

import java.util.Date;

public class Booking {
    private long id;
    private boolean status;
    private long userId;
    private int movieId;
    int noOfSeats;
    Date booked_date;

    public Booking(){
    }

    public Booking(boolean status, long userId, int movieId, int noOfSeats, Date booked_date) {
        this.status = status;
        this.userId = userId;
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
        this.booked_date = booked_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Date getBooked_date() {
        return booked_date;
    }

    public void setBooked_date(Date booked_date) {
        this.booked_date = booked_date;
    }
}
