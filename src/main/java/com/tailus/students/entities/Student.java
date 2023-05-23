package com.tailus.students.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    // id autoincrement sous Spring
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true, length = 10)
    private String matricule;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 15)
    private String phone;

    @Column(nullable = false, length = 2)
    private String genre;

    public Student(String name, String email, String phone, String genre) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.genre = genre;
        genMatricule();
    }

    public Student() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matricule='" + matricule + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void genMatricule() {
        this.matricule = "23" + name.substring(0, 2).toUpperCase() + phone.substring(0, 3);
    }
}
