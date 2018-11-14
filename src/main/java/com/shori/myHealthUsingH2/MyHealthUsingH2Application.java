package com.shori.myHealthUsingH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;


@SpringBootApplication  //eables auto config
public class MyHealthUsingH2Application implements ApplicationRunner{


	@Autowired
	JdbcDAO dao;
	public static void main(String[] args) {
		SpringApplication.run(MyHealthUsingH2Application.class, args);
	}




	@Override
	public void run(ApplicationArguments args) throws Exception {
    List<Person> resultsString = dao.findAll();
    
    Person id = dao.findById(1001);
    Person name = dao.findByName("Gavin");
    
    int removeid = dao.deleteById(1006);
    
		
		System.out.println(resultsString);
		System.out.println(id);
		System.out.println(name);
		System.out.println("Successfully removed " +removeid);
		
		
		
		
	}
	
	
	
}
