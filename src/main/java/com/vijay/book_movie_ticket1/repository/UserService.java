package com.vijay.book_movie_ticket1.repository;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vijay.book_movie_ticket1.dto.LoginDto;
import com.vijay.book_movie_ticket1.dto.PasswordDto;
import com.vijay.book_movie_ticket1.dto.UserDto;
import org.springframework.ui.ModelMap;

import jakarta.servlet.http.HttpSession;

public interface UserService {

	String register(UserDto userDto, BindingResult result,RedirectAttributes attributes);

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);
	
	String logout(HttpSession session, RedirectAttributes attributes);
	
	String submitOtp(int otp, String email, RedirectAttributes attributes);
	
	String resendOtp(String email, RedirectAttributes attributes);

	String forgotPassword(String email, RedirectAttributes attributes);

	String resetPassword(PasswordDto passwordDto, BindingResult result, RedirectAttributes attributes, ModelMap map);
}
