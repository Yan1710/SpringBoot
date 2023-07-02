package com.example.demo.Students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentsServices studentsServices;
    public StudentController(StudentsServices studentsServices){
        this.studentsServices = studentsServices;
    }
    @GetMapping
    public List<Student> getstudents(){
    return  studentsServices.getStudents();
    }
}
