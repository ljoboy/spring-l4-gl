package com.tailus.students.controllers;

import com.tailus.students.entities.Student;
import com.tailus.students.services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class StudentsController {
    @Autowired
    public StudentServiceInterface service;

    public Optional<Student> studentsList;
    @GetMapping("/")
    public String index(Model model) {
        studentsList = service.findById(1L);

        model.addAttribute("students", studentsList);

        return "students/index";
    }
}
