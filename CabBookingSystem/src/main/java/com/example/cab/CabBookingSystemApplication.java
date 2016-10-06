package com.example.cab;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.person.Person;
import com.example.repo.PersonRepositary;

@SpringBootApplication
@EnableJpaRepositories
public class CabBookingSystemApplication {
	
	private static final Logger log = LoggerFactory.getLogger(CabBookingSystemApplication.class);
	
	@Bean
	public CommandLineRunner demo(PersonRepositary repository) {
		 Person p = new Person();
		 p.setName("Swastika mitra");
		 p.setCountry("India");
		 p.setGender("Female");
		 
		 repository.save(p);
		log.info("Person created" + p);
		return null;
	}

	
	public static void main(String[] args) {
		
	 SpringApplication.run(CabBookingSystemApplication.class, args);
	
	
	}
}