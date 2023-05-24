package com.tailus.students.services;

import com.tailus.students.entities.Student;
import com.tailus.students.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class StudentService implements StudentServiceInterface {

    @Autowired private StudentRepo studentRepo;

    @Override
    public void deleteAll() {
        studentRepo.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public void delete(Student student) {
        studentRepo.delete(student);
    }

    @Override
    public boolean existsById(Long id) {
        return studentRepo.existsById(id);
    }

    @Override
    public ArrayList<Student> findAll() {
        return (ArrayList<Student>) studentRepo.findAll();
    }

    @Override
    public ArrayList<Student> findAllById(Iterable<Long> iterable) {
        return (ArrayList<Student>) studentRepo.findAllById(iterable);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public ArrayList<Student> saveAll(ArrayList<Student> students) {
        return (ArrayList<Student>) studentRepo.saveAll(students);
    }

    @Override
    public Optional<Student> findByMatricule(String matricule) {
        return studentRepo.findByMatricule(matricule);
    }
}
