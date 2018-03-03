package com.example.hibernate.repository;

import com.example.hibernate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {

    @Autowired
    EntityManager entityManager;

    public Student findById(Long id){
        return entityManager.find(Student.class, id);
    }

    public Student save(Student student){
        if(student.getId()==null){
            entityManager.persist(student);
        } else {
            entityManager.merge(student);
        }
        return student;
    }

    public Student delete(Long id){
        Student student=findById(id);
        entityManager.remove(student);
        return student;
    }
}
