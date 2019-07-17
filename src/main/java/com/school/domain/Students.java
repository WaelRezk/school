package com.school.domain;

import javax.persistence.*;


//@NamedQuery(name="Students.findByLastName",
//query="select i from Students i, where i.last_name = :lastName " ) 

//@NamedQuery(name="Students.findByFirstName",
//query="select i from Item i, Category c where c.name = :categoryName and i member of c.items" ) 
//
//@NamedQuery(name="Students.findByFirstAndLastName",
//query="select i from Item i, Category c where c.name = :categoryName and i member of c.items" ) 
//


@Entity
@Table(name = "STUDENTS")
public class Students {



	public Students() {


	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Students(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
