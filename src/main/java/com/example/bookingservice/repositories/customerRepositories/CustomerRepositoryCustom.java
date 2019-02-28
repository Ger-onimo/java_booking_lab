package com.example.bookingservice.repositories.customerRepositories;

import com.example.bookingservice.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllTheCustomersByCourseTown(String courseTown);
    List<Customer> getAllTheCustomersByAgeAndTownAndCourse(int age, String customerTown, String courseName);

    }
