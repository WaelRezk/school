package com.school.dao;

import java.util.List;

import com.school.domain.Students;

public interface StudentDao {

	/*
	 * Display a list of students with the ability to search by last name and/or
	 * first name. Edit a Student View Student Information Left Menu
	 */

	public List<Students> findAllstudents();
	public List<Students> findByLastName(String lastName);
	public List<Students> findByFirstName(String firstName);
	public List<Students> findByFirstAndLastName(String firstName, String lastName);
	public Students UpdateStudent(Students s);
}
