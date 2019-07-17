package com.school.service;

import java.util.List;

import com.school.domain.Students;

public interface IStudentService {

	public List<Students> findAllstudents();
	public List<Students> findByLastName(String lastName);
	public List<Students> findByFirstName(String firstName);
	public List<Students> findByFirstAndLastName(String firstName, String lastName);
	public Students UpdateStudent(Students s);

}
