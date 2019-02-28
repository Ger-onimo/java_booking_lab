package com.example.bookingservice.components;

import com.example.bookingservice.models.Booking;
import com.example.bookingservice.models.Course;
import com.example.bookingservice.models.Customer;
import com.example.bookingservice.repositories.bookingRepositories.BookingRepository;
import com.example.bookingservice.repositories.courseRepositories.CourseRepository;
import com.example.bookingservice.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Course course1 = new Course("python", "Edinburgh",5);
        courseRepository.save(course1);
        Course course2 = new Course("java", "Glasgow",5);
        courseRepository.save(course2);
        Course course3 = new Course("ruby", "Edinburgh",1);
        courseRepository.save(course3);


        Customer customer1 = new Customer("Joe", "Edinburgh",25);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Anna", "Inverness",30);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Sam", "Glasgow",40);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Jen", "Glasgow",25);
        customerRepository.save(customer4);


        Booking booking1 = new Booking("01-01-2019", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("01-03-2019", course2, customer1);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("01-03-2019",course2,customer2);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("11-01-2019",course1,customer2);
        bookingRepository.save(booking4);

    }
}
