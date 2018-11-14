package com.shori.myHealthUsingH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class JdbcDAO {
	
	// things are made easy using jdbcTemplate
	@Autowired
	JdbcTemplate jdbcTemplate;
public List<Person> findAll()
{
	return jdbcTemplate.query("select * from person", 
			new BeanPropertyRowMapper<Person>(Person.class));
	
}


public Person findById(int id)
{
//	return jdbcTemplate.query("select * from person", 
//			new BeanPropertyRowMapper<Person>(Person.class));
	return jdbcTemplate.queryForObject("select * from person Where id = ?", new Object[] {id},
			new BeanPropertyRowMapper<Person>(Person.class));
	
}




public Person findByName(String name)
{

	return jdbcTemplate.queryForObject("select * from person Where name = ?", new Object[] {name},
			new BeanPropertyRowMapper<Person>(Person.class));
	
}

public int deleteById(int id)
{

	return jdbcTemplate.update("delete from person Where id = ?", 
			new Object[] {id});
		
	
}



}
