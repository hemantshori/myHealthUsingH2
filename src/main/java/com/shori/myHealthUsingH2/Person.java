package com.shori.myHealthUsingH2;

import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.springframework.stereotype.Component;

@Entity
@Component
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
// my plain pojo
public class Person {

	@Id
	int id;
	String name;
	String location;
	Date dob;

	public Person() {

	}

	public Person(int id, String name, String location, Date dob) {

		this.id = id;
		this.name = name;
		this.location = location;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", dob=" + dob + "]";
	}

}
