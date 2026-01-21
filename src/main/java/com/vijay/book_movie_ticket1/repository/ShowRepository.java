package com.vijay.book_movie_ticket1.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Movie;
import com.vijay.book_movie_ticket1.entity.Screen;
import com.vijay.book_movie_ticket1.entity.Show;
public interface ShowRepository extends JpaRepository<Show, Long> {
	List<Show> findByScreen(Screen screen);
	List<Show> findByShowDateAfter(LocalDate date);
	List<Show> findByMovieAndShowDateAfter(Movie movie, LocalDate date);
	boolean existsByScreen(Screen screen);
	boolean existsByMovie(Movie movie);
	List<Show> findByShowDateAndMovie(LocalDate showDate, Movie movie);
}