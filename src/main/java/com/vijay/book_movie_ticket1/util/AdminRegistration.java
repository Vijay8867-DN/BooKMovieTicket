package com.vijay.book_movie_ticket1.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vijay.book_movie_ticket1.entity.User;
import com.vijay.book_movie_ticket1.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class AdminRegistration implements CommandLineRunner {

	@Value("${admin.email}")
	private String adminEmail;

	@Value("${admin.password}")
	private String adminPassword;

	private final UserRepository userRepository;

	@Override
	public void run(String... args) {

		if (userRepository.existsByEmail(adminEmail)) {
			log.info("Admin already exists");
			return;
		}

		User adminUser = new User(null, "ADMIN", adminEmail, 0L, AES.encrypt(adminPassword), "ADMIN", false);

		userRepository.save(adminUser);
		log.info("Admin registration successful");
	}
}
