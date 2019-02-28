package com.example.bookingservice.repositories.customerRepositories;

import com.example.bookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> getAllTheCustomersByCourseTown(String courseTown);
    List<Customer> getAllTheCustomersByAgeAndTownAndCourse(int age, String customerTown, String courseName);


//    List<Customer> findCustomersByCourseId(Long id);
}
