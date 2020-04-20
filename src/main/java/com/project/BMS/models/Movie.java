package com.project.BMS.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "theatre_id")
    private String theatreId;

//    @Column(name = "status")
//    private boolean releaseStatus;
}
