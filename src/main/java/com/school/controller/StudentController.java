package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.domain.Students;
import com.school.service.IStudentService;

@RestController
@RequestMapping("/students")

public class StudentController {

	@Autowired
	IStudentService studentService;

	@GetMapping("/")
	public List<Students> findAllStudent() {
		return studentService.findAllstudents();
	}

	@GetMapping("/{lastName}")
	public List<Students> findByLastName(String lastName) {
		return studentService.findByLastName(lastName);

	}

	@GetMapping("/{firstName}")
	public List<Students> findByFirstName(String firstName) {
		return studentService.findByFirstName(firstName);

	}
	
	@GetMapping("/{firstName}/{lastName}")
	public List<Students> findByFirstAndLastName(String firstName, String lastName) {
		return studentService.findByFirstAndLastName(firstName,lastName);
	}
	
	@PutMapping
	public Students UpdateStudent(@RequestBody Students s) {
		return studentService.UpdateStudent(s);
		}
	}
