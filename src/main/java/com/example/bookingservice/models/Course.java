package com.example.bookingservice.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_town")
    private String courseTown;

    @Column(name = "star_rating")
    private int starRating;

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Booking> bookings;

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    private List<Customer> customers;


    public Course(String courseName, String courseTown, int starRating) {
        this.courseName = courseName;
        this.courseTown = courseTown;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTown() {
        return courseTown;
    }

    public void setCourseTown(String courseTown) {
        this.courseTown = courseTown;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
}
