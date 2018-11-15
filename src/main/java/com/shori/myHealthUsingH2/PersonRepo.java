package com.shori.myHealthUsingH2;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
//this is repo 

public class PersonRepo {

	
	// connect to DB
	@PersistenceContext
	EntityManager entityManager;
	
	
	
	public List<Person> findAll()
	{
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		
		return namedQuery.getResultList();
	}
	
	
	public Person findById(int id)
	{
		return entityManager.find(Person.class, id);
		
	}
	
	
	public Person addEntity(Person person)
	{
		return entityManager.merge(person);
		
	}
	
	public Person updateEntity(Person person)
	{
		return entityManager.merge(person);
		
	}

	public void deleteEntity(int id)
	{
		Person person = findById(id);
		entityManager.remove(person);
		
	}

	
}
