package com.example.hibernate.controller;

import com.example.hibernate.entity.Course;
import com.example.hibernate.entity.Review;
import com.example.hibernate.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses/{id}")
    public Course get(@PathVariable Long id){
        return courseRepository.findById(id);
    }

    @DeleteMapping("courses/{id}")
    public Course delete(@PathVariable Long id){
        return courseRepository.delete(id);
    }

    @PostMapping
    public void add(@RequestBody Course course){
        courseRepository.save(course);
    }

    @PostMapping("courses/{id}/reviews")
    public void addReviews(@PathVariable Long id, @RequestBody List<Review> reviews){
        courseRepository.addReviewsForCourse(id, reviews);
    }
}
