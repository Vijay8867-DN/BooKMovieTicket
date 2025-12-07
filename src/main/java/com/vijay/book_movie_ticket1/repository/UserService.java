package com.vijay.book_movie_ticket1.repository;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vijay.book_movie_ticket1.dto.LoginDto;
import com.vijay.book_movie_ticket1.dto.PasswordDto;
import com.vijay.book_movie_ticket1.dto.TheaterDto;
import com.vijay.book_movie_ticket1.dto.UserDto;

import java.io.IOException;

import org.springframework.ui.ModelMap;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

public interface UserService {

	String register(UserDto userDto, BindingResult result,RedirectAttributes attributes);

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);
	
	String logout(HttpSession session, RedirectAttributes attributes);
	
	String submitOtp(int otp, String email, RedirectAttributes attributes);
	
	String resendOtp(String email, RedirectAttributes attributes);

	String forgotPassword(String email, RedirectAttributes attributes);

	String resetPassword(PasswordDto passwordDto, BindingResult result, RedirectAttributes attributes, ModelMap map);
	

	String manageUsers(HttpSession session, RedirectAttributes attributes, ModelMap map);

	String blockUser(Long id,HttpSession session, RedirectAttributes attributes);

	String unBlockUser(Long id, HttpSession session, RedirectAttributes attributes);
	
	String manageTheater(ModelMap map, RedirectAttributes attributes, HttpSession session);

	String loadAddTheater(HttpSession session,RedirectAttributes attributes, TheaterDto theaterDto);

	String addTheater(HttpSession session, RedirectAttributes attributes, @Valid TheaterDto theaterDto,
			BindingResult result) throws IOException;
}
