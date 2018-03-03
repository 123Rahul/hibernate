package com.example.hibernate.controller;

import com.example.hibernate.entity.Student;
import com.example.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/students/{id}")
    public Student get(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping("/students/{id}")
    public Student delete(@PathVariable Long id){
        return repository.delete(id);
    }
    @PostMapping("/students")
    public Student add(@RequestBody Student student){
        return repository.save(student);
    }
}
