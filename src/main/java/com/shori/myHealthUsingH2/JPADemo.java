package com.shori.myHealthUsingH2;

import java.sql.Date;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class JPADemo implements CommandLineRunner {

	
	@Autowired
	PersonRepo personRepo;
	
	
	public static void main(String[] args) {
	SpringApplication.run(JPADemo.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		
	Person ls = personRepo.findById(1001);
	
	System.out.println(ls);
	
	
	Person addPerson = personRepo.addEntity(new Person(1000,"xxx", "xxx", new Date(0)));
	
	System.out.println(addPerson);
	
	
	Person updatePerson = personRepo.updateEntity(new Person(1000,"yyy", "tukeelaina", new Date(0)));
	
	System.out.println(updatePerson);
	
	
	 personRepo.deleteEntity(1000);
	 
	 
	System.out.println(personRepo.findAll());
	
	}

}
