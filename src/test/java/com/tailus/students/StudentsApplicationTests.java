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
        Student student = new Student();
        student.setName("John Doe");
        student.setMatricule("987654321");
        student.setEmail("john@doe.com");
        student.setGenre("M");
        student.setPhone("987654321");

        studentRepo.save(student);

        Assertions.assertThat(student).isNotNull();
    }

}
