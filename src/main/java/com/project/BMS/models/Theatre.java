package com.project.BMS.models;

import javax.persistence.*;

@Entity
@Table(name = "theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "theatre_name")
    private String theatreName;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "total_seats")
    private Seat totalSeats;

    public Theatre(String theatreName, String cityName) {
        this.theatreName = theatreName;
        this.cityName = cityName;
    }

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
