package com.example.tp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {



    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void newStudent(@RequestBody student s) {
        studentService.addStudent(s);
    }



    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) {

        studentService.deleteStudent(id);
    }


    @GetMapping("/jsp")
    public ModelAndView getStudentsJSP() {
        ModelAndView mav = new ModelAndView("index");
        List<student> studentList = studentService.getStudents();
        mav.addObject("students", studentList);
        return mav;
    }

    @GetMapping("/add-student")
    public ModelAndView addStudent() {
        ModelAndView mav = new ModelAndView("add_student");
        mav.addObject("command", new student());
        return mav;
    }




}