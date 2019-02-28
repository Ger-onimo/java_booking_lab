package com.example.bookingservice.models;

import javax.persistence.*;

@Entity
@Table( name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="customer_name")
    private String customerName;

    @Column( name = "customer_town")
    private String customerTown;

    @Column( name = "age")
    private int age;

    //TODO one to many bookings

    public Customer(String customerName, String customerTown, int age) {
        this.customerName = customerName;
        this.customerTown = customerTown;
        this.age = age;
    }

    public Customer() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTown() {
        return customerTown;
    }

    public void setCustomerTown(String customerTown) {
        this.customerTown = customerTown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
