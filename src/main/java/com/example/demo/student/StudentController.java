package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
// Change url to http://localhost:8080/api/v1/student
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // Use|declare StudentService class and pass it into the constructor

    private final StudentService studentService;

    //inject the StudentService into the constructor
    @Autowired
    public StudentController(StudentService studentService) {
        //this.studentService = studentService wont wotk because we dont have an Instance of a studentService
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


}
