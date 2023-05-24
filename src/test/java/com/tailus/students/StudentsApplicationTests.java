package com.tailus.students;

import com.tailus.students.entities.Student;
import com.tailus.students.repositories.StudentRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    public StudentRepo studentRepo;
    @Test
    public void save() {
        Student student = new Student(
                "Nathan Mwape",
                "nathan@mwape.com",
                "+243123456789",
                "M"
        );

        studentRepo.save(student);

        Assertions.assertThat(student).isNotNull();
    }

}
