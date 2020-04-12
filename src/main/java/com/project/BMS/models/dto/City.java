package com.project.BMS.models.dto;

import javax.persistence.*;

public class City {
    private int id;
    private String name;

    public City(){}

    public City(String cityName) {
        this.name = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
