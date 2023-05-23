package com.tailus.students.services;

import com.tailus.students.entities.Student;
import com.tailus.students.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.Optional;

@Service
@Transactional
public class StudentService implements StudentServiceInterface {

    @Autowired
    public StudentRepo studentRepo;

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
    public Iterable<Student> findAll() {
         Iterable<Student> studentsList = studentRepo.findAll();
        studentsList.forEach(student -> {
            System.out.println(student.getName());
        });
        return studentsList;
    }

    @Override
    public Iterable<Student> findAllById(Iterable<Long> iterable) {
        return studentRepo.findAllById(iterable);
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
    public Iterable<Student> saveAll(Iterable<Student> iterable) {
        return studentRepo.saveAll(iterable);
    }

    @Override
    public Optional<Student> findByMatricule(String matricule) {
        return studentRepo.findByMatricule(matricule);
    }
}
