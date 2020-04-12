package com.project.BMS.models.dto;

public class Seat {
    private int capacity;
    private int availableSeats;

    public Seat(){}

    public Seat(int capacity, int availableSeats) {
        this.capacity = capacity;
        this.availableSeats = availableSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
