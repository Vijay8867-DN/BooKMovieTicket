package com.vijay.book_movie_ticket1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vijay.book_movie_ticket1.dto.LoginDto;
import com.vijay.book_movie_ticket1.dto.UserDto;
import com.vijay.book_movie_ticket1.repository.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping({"/","main"})
	public String loadMain() {
		return "main.html";
	}
	
	@GetMapping("/register")
	public String loadRegister(UserDto userDto) {
		return "register.html";
	}

	@PostMapping("/register")
	public String register(@Valid UserDto userDto, BindingResult result) {
		return userService.register(userDto, result);
	}

	@GetMapping("/login")
	public String loadLogin() {
		return "login.html";
	}
	
	@PostMapping("/login")
	public String login(LoginDto dto,RedirectAttributes attributes,HttpSession session) {
		return userService.login(dto,attributes,session);
	}
}
