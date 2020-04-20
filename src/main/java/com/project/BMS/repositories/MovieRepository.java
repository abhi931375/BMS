package com.project.BMS.repositories;

import com.project.BMS.models.dto.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    @Query(value = "SELECT case when count(*)>0 then true else false end FROM MOVIE WHERE THEATRE_NAME = ?2 && NAME = ?1", nativeQuery = true)
    boolean movieByMovieAndTheatreName(String movieName, String theatreName);

    @Query(value = "SELECT ")

    public String addMovie(Movie movie);
}
