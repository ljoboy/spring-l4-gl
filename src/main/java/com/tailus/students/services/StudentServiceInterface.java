package com.tailus.students.services;

import com.tailus.students.entities.Student;
import com.tailus.students.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface StudentServiceInterface {
    public void deleteAll();
    public void deleteById(Long id);
    public void delete(Student student);
    public boolean existsById(Long id);
    public Iterable<Student> findAll();
    public Iterable<Student> findAllById(Iterable<Long> iterable);
    public Optional<Student> findById(Long id);
    public Student save(Student student);
    public Iterable<Student> saveAll(Iterable<Student> iterable);
    // Custom Methods
    public Optional<Student> findByMatricule(String matricule);
}
