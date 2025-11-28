package com.vijay.book_movie_ticket1.repository;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vijay.book_movie_ticket1.dto.LoginDto;
import com.vijay.book_movie_ticket1.dto.UserDto;

import jakarta.servlet.http.HttpSession;

public interface UserService {

	String register(UserDto userDto, BindingResult result);

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);
}
