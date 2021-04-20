package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringBaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBaApplication.class, args);
	}
@Autowired
private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("nivetha","kumar","nivanivesha98@gmail.com"));
		this.userRepository.save(new User("deepika","guna","deepika@gmail.com"));
		this.userRepository.save(new User("jeysri","karuna","jeysri@gmail.com"));
		this.userRepository.save(new User("pavithra","sethu","pavithra@gmail.com"));
	}

}
