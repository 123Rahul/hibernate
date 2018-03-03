package com.example.hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Review> reviews;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course() {
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public void removeReview(Review review){
        this.reviews.remove(review);
    }

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
