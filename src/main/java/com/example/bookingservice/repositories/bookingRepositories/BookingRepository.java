package com.example.bookingservice.repositories.bookingRepositories;

import com.example.bookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {


}
