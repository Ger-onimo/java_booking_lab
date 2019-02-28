package com.example.bookingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    // TODO many to one course
    @ManyToOne
    @JoinColumn(name = "courses_id", nullable = false)
    private Course course;


    // TODO many to one customer


    //TODO many to many with course and customer

    public Booking(String date, Course course ) {
        this.date = date;
        this.course = course;
    }

    public Booking(){
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
