package com.vijay.book_movie_ticket1.dto;

import java.util.ArrayList;
import java.util.List;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SeatLayoutForm {

	@NotEmpty(message = "* Seat layout cannot be empty")
	private List<SeatRowDto> rows = new ArrayList<>();
}
