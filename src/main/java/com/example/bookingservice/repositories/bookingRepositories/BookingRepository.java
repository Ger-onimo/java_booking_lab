package com.example.bookingservice.repositories.bookingRepositories;

import com.example.bookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking>  findBookingsByDate(String date);
}
