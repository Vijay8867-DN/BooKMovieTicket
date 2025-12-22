package com.vijay.book_movie_ticket1.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Movie;



public interface MovieRepository extends JpaRepository<Movie, Long> {

	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);

}
