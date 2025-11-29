package com.vijay.book_movie_ticket1.config;

import java.security.SecureRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	SecureRandom random() {
		return new SecureRandom();
	}
}
