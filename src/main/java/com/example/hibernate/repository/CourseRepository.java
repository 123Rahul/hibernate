package com.example.hibernate.repository;

import com.example.hibernate.entity.Course;
import com.example.hibernate.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findById(Long id) {
        Course course = entityManager.find(Course.class, id);
        return course;
    }

    public void save(Course course) {
        if (course.getId() == null) {
            entityManager.persist(course);
        } else {
            entityManager.merge(course);
        }
    }

    public Course delete(Long id) {
        Course course = findById(id);
        entityManager.remove(course);
        return course;
    }

    public void addReviewsForCourse(Long courseId, List<Review> reviews) {
        Course course = findById(courseId);
        for (Review review : reviews) {
            course.addReview(review);
            review.setCourse(course);
            entityManager.persist(review);
        }
    }
}
