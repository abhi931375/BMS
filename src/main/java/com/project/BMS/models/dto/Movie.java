package com.project.BMS.models.dto;

import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable {
    private long id;
    private String name;
    private String theatreName;
    private List<Integer> showNumbers;
    private boolean releaseStatus;

    public Movie() {
    }

    public Movie(String name, String theatreName){
        this.name = name;
        this.theatreName = theatreName;
    }

    public boolean isReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(boolean releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
