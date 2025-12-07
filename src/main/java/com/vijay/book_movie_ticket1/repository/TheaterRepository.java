package com.vijay.book_movie_ticket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

	boolean existsByNameAndAddress(String name, String address);

}
