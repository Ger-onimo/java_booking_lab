package com.example.bookingservice.repositories.customerRepositories;

import com.example.bookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
