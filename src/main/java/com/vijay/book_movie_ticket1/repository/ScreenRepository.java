package com.vijay.book_movie_ticket1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Screen;
import com.vijay.book_movie_ticket1.entity.Theater;

public interface ScreenRepository extends JpaRepository<Screen, Long> {

	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);

}
