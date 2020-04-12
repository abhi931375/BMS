//package com.project.BMS.models;
//
//import net.bytebuddy.dynamic.loading.InjectionClassLoader;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.time.*;
//
//public class Show {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private long id;
//
//    @Column(name = "start_time")
//    private LocalTime startTime;
//
//    @Column(name = "end_time")
//    private LocalTime endTime;
//
//    @Column(name = "start_date")
//    private LocalDate startDate;
//
//    @Column(name = "end_date")
//    private LocalDate endDate;
//
//    @Column(name = "theatre_name")
//    private String theatreName;
//
//    @Column(name = "movie_name")
//    private String movieName;
//
//    public Show(LocalTime startTime, LocalTime endTime, LocalDate startDate, LocalDate endDate, String theatreName, String movieName) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.theatreName = theatreName;
//        this.movieName = movieName;
//    }
//
//    public Show(){
//    }
//
//    public LocalTime getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(LocalTime startTime) {
//        this.startTime = startTime;
//    }
//
//    public LocalTime getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(LocalTime endTime) {
//        this.endTime = endTime;
//    }
//
//    public LocalDate getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(LocalDate startDate) {
//        this.startDate = startDate;
//    }
//
//    public LocalDate getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(LocalDate endDate) {
//        this.endDate = endDate;
//    }
//
//    public String getTheatreName() {
//        return theatreName;
//    }
//
//    public void setTheatreName(String theatreName) {
//        this.theatreName = theatreName;
//    }
//
//    public String getMovieName() {
//        return movieName;
//    }
//
//    public void setMovieName(String movieName) {
//        this.movieName = movieName;
//    }
//}
