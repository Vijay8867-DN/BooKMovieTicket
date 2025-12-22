package com.vijay.book_movie_ticket1.dto;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MovieDto {
	@NotBlank(message = "* It is Required")
	private String name;
	@NotBlank(message = "* It is Required")
	private String languages;
	@NotBlank(message = "* It is Required")
	private String genre;
	@NotBlank(message = "* It is Required")
	private String duration;
	private MultipartFile image;
	@NotBlank(message = "* It is Required")
	private String trailerLink;
	@NotBlank(message = "* It is Required")
	private String description;
	@NotBlank(message = "* It is Required")
	private LocalDate releaseDate;
	@NotBlank(message = "* It is Required")
	private String cast;
}
