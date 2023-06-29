package com.example.demo;

import com.example.demo.Students.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class EstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}
@GetMapping
	public List<Student>students(){
	return List.of(
			new Student(
					1L,
					"Maria",
					"mariam@gmail.com",
					LocalDate.of(2000, Month.APRIL,5),
					21

			)
	);
}
}
