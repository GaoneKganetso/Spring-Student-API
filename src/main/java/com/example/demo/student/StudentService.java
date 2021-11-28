package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//allow Spring to automatically detect the custom StudentService class as a bean using @Component/Service
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Gaone",
                        "gaone@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )

        ) ;
    }
}
