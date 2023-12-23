package com.sj.springboot.learnjpaandhibernate.course.jdbc;

import com.sj.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Spring", "ride"));
        repository.insert(new Course(2, "Learn Spring JDBC", "ride"));
        repository.insert(new Course(3, "Learn Spring JPA", "ride"));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
