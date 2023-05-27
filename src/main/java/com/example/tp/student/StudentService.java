package com.example.tp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(student s) {
        studentRepository.save(s);
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
