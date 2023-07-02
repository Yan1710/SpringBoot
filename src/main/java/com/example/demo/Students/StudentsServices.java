package com.example.demo.Students;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentsServices {
    public List<Student>getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Maria",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21

                )
        );
    }

}
