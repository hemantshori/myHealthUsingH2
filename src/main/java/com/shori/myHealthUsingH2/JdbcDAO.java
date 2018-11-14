package com.shori.myHealthUsingH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class JdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
public List<Person> findAll()
{
	return jdbcTemplate.query("select * from person", 
			new BeanPropertyRowMapper<Person>(Person.class));
	
}

}
