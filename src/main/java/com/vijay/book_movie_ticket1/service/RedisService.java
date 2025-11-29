package com.vijay.book_movie_ticket1.service;

import com.vijay.book_movie_ticket1.dto.UserDto;

public interface RedisService {

	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);

}
