package com.tailus.students.services;

import com.tailus.students.entities.Student;

import java.util.ArrayList;
import java.util.Optional;

public interface StudentServiceInterface {
    public void deleteAll();
    public void deleteById(Long id);
    public void delete(Student student);
    public boolean existsById(Long id);
    public ArrayList<Student> findAll();
    public ArrayList<Student> findAllById(Iterable<Long> iterable);
    public Optional<Student> findById(Long id);
    public Student save(Student student);
    public ArrayList<Student> saveAll(ArrayList<Student> iterable);
    // Custom Methods
    public Optional<Student> findByMatricule(String matricule);
}
