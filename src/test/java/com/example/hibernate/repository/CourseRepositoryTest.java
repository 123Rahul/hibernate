package com.example.hibernate.repository;

import com.example.hibernate.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    CourseRepository repository;

    @Test
    public void testFindById(){
        Course course=repository.findById(101L);
        assertEquals("java", course.getName());
    }

    /*public void testSave(){
        Course course=new Course("angular");
        Course courseSaved=repository.save(course);
        assertEquals(course.getName(), courseSaved.getName());
    }*/
}
