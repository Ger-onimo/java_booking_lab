package com.example.bookingservice.repositories.courseRepositories;

import com.example.bookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
