package com.tailus.students.controllers;

import com.tailus.students.entities.Student;
import com.tailus.students.services.StudentServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class StudentsController {
    @Autowired
    private StudentServiceInterface service;

    public ArrayList<Student> studentsList;

    @GetMapping("/")
    public String index(Model model) {
        studentsList = service.findAll();
        model.addAttribute("students", studentsList);

        return "students/index";
    }

    @GetMapping("/add")
    public String create() {
        return "students/add";
    }

    @PostMapping("/add")
    public String store(@Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "students/add";
        }
        student.genMatricule();
        service.save(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable String id) {
        Optional<Student> student = service.findById(Long.parseLong(id));
        if (student.isEmpty()) {
            return "redirect:/";
        }
        model.addAttribute("student", student.get());
        return "students/update";
    }

    @PostMapping("/edit/{id}")
    public String update(@Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "students/update";
        }
        service.save(student);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        Optional<Student> student = service.findById(Long.parseLong(id));
        if (student.isEmpty()) {
            return "redirect:/";
        }
        service.delete(student.get());
        return "redirect:/";
    }
}
