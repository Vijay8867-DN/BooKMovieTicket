package com.vijay.book_movie_ticket1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class SeatRowDto {

	@NotBlank(message = "* Row Name is Required")
	private String rowName;

	@NotNull(message = "* Total Seats is Required")
	private Integer totalSeats;

	@NotBlank(message = "* Category is Required")
	private String category;
}
