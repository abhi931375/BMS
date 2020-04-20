package com.project.BMS.repositories;

import com.project.BMS.models.dto.Theatre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TheatreRepository extends CrudRepository<Theatre, Long> {

    @Query(value = "SELECT * FROM THEATRES WHERE THEATRE_NAME = ?1", nativeQuery = true)
    Theatre findByTheatreName(String theatreName);

    @Query(value = "SELECT case when count(*)>0 then true else false end FROM THEATRES WHERE THEATRE_NAME = ?1", nativeQuery = true)
    boolean theatresByTheatreName(String theatreName);

    @Query(value = "SELECT distinct(city_id) from THEATRES", nativeQuery = true)
    List<Long> getCityIds();

    @Query(value = "SELECT DISTINCT(CITY_ID) FROM THEATRES WHERE OWNER_ID = ?1", nativeQuery = true)
    List<Long> getCityIds(Long ownerId);

    String addTheatre(Theatre theatre);
}
