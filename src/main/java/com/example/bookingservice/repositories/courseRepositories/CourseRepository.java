package com.example.bookingservice.repositories.courseRepositories;

import com.example.bookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByStarRating(int starRating);
}
