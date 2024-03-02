package com.springbootjpa.practicejpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbootjpa.practicejpa.dao.UserRepository;
import com.springbootjpa.practicejpa.entities.User;

@SpringBootApplication
public class PracticejpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticejpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		// User user = new User();
		// user.setName("Jay");
		// user.setCity("Surat");
		// user.setStatus("I am a Pro Developer");

		// User save = userRepository.save(user);
		// System.out.println(save);


		// Update the user
		// Optional<User> optionalUser = userRepository.findById(1);

		// User user2 = optionalUser.get();
		// user2.setName("Ankit");
		// userRepository.save(user2);
		

		// Get All users
		// Iterable<User> users = userRepository.findAll();

		// users.forEach(user->{
		// 	System.out.println(user);
		// });
		
		// Delete the user
		userRepository.deleteById(2);
	}

}
