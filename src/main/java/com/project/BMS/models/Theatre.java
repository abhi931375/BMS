package com.project.BMS.models;

import com.project.BMS.models.dto.Seat;

import javax.persistence.*;

@Entity
@Table(name = "theatres")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(unique = true, nullable = false, name = "theatre_name")
    private String theatreName;

    @Column(name = "city_id")
    private long cityId;

    @Column(name = "owner_id")
    private long ownerId;
}
