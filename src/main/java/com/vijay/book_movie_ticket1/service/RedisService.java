package com.vijay.book_movie_ticket1.service;

import com.vijay.book_movie_ticket1.dto.UserDto;
import com.vijay.book_movie_ticket1.entity.BookedTicket;

public interface RedisService {
	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getUserDto(String email);

	int getOtp(String email);

	void saveTicket(String orderId, BookedTicket ticket);

	BookedTicket getTicket(String orderId);
}
