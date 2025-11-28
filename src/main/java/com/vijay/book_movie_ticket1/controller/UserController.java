package com.vijay.book_movie_ticket1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/")
	public String loadMain() {
		return "main.html";
	}
}
