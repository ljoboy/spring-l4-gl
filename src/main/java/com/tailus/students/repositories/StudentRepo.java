package com.tailus.students.repositories;

import com.tailus.students.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    Optional<Student> findByMatricule(String matricule);
}
