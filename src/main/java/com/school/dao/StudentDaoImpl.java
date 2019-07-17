package com.school.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.school.domain.Students;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Students> findAllstudents() {
		Query query = entityManager.createQuery("select s from Students s");
		return (List<Students>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Students> findByLastName(String lastName) {
		Query query = entityManager.createQuery("select s from Students s where s.lastName =:lastName");
		return (List<Students>) query.setParameter("lastName", lastName).getResultList();

	}

	@Override
	public List<Students> findByFirstName(String firstName) {
		Query query = entityManager.createQuery("select s from Students s where s.firstName =:firstName");
		return (List<Students>) query.setParameter("firstName", firstName).getResultList();

	}

	@Override
	public Students UpdateStudent(Students s) {
		return entityManager.merge(s);
	}

	@Override
	public List<Students> findByFirstAndLastName(String firstName, String lastName) {
		Query query = entityManager.createQuery("select s from Students s where s.firstName =:firstName and s.lastName =:lastName");
		return (List<Students>) query.setParameter("firstName", firstName).setParameter("lastName", lastName).getResultList();

	}

}
