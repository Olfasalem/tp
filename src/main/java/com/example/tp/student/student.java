package com.example.tp.student;


import jakarta.persistence.*;

@Entity
@Table(name = "etudiantss")

public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etudiants_SEQ")
    @SequenceGenerator(name = "etudiants_SEQ", sequenceName = "etudiantss_id_seq", allocationSize = 1)
    @Column(name = "id")

    private Long id;
    private String name;
    private String email;
    private int age;

    public student() {
    }

    public student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
