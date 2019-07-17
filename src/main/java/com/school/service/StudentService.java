package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.dao.StudentDao;
import com.school.domain.Students;

@Service
@Transactional
public class StudentService implements IStudentService {

	@Autowired
	StudentDao stuDao;

	@Override
	public List<Students> findAllstudents() {
		return stuDao.findAllstudents();
	}

	@Override
	public List<Students> findByLastName(String lastName) {
		return stuDao.findByLastName(lastName);
	}

	@Override
	public List<Students> findByFirstName(String firstName) {
		return stuDao.findByFirstName(firstName);
	}

	@Override
	public Students UpdateStudent(Students s) {
		return stuDao.UpdateStudent(s);
	}

	@Override
	public List<Students> findByFirstAndLastName(String firstName, String lastName) {
		return stuDao.findByFirstAndLastName(firstName, lastName);

	}

}
