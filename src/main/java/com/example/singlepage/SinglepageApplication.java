package com.example.singlepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.singlepage.model.User;
import com.example.singlepage.repository.UserRepository;

@SpringBootApplication
public class SinglepageApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SinglepageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("Mario","Pumpler"));
		userRepository.save(new User("Luigi","Pumpler"));
		userRepository.save(new User("Princess","Mushroom"));
		
	}
}
