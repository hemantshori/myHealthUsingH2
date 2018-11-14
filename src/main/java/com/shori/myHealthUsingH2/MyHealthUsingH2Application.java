package com.shori.myHealthUsingH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;


@SpringBootApplication
public class MyHealthUsingH2Application implements ApplicationRunner{


	@Autowired
	JdbcDAO dao;
	public static void main(String[] args) {
		SpringApplication.run(MyHealthUsingH2Application.class, args);
	}




	@Override
	public void run(ApplicationArguments args) throws Exception {
    List<Person> resultsString = dao.findAll();
		
		System.out.println(resultsString);
		
		
		
		
	}
	
	
	
}
