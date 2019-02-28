package com.example.bookingservice;

import com.example.bookingservice.models.Booking;
import com.example.bookingservice.models.Course;
import com.example.bookingservice.models.Customer;
import com.example.bookingservice.repositories.bookingRepositories.BookingRepository;
import com.example.bookingservice.repositories.courseRepositories.CourseRepository;
import com.example.bookingservice.repositories.customerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;


	@Test
	public void canFindCoursesByRating(){
		List<Course> found = courseRepository.findCoursesByStarRating(5);
	}

//	@Test
//	public void canFindCustomersByCourseId(){
//		List<Customer>  found = customerRepository.findCustomersByCourseId(1L);
//	}

	@Test
	public void canFinfBookingsByDate(){
		List<Booking> found = bookingRepository.findBookingsByDate("01-03-2019");
	}

}
