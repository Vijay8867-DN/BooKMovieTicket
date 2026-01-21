package com.vijay.book_movie_ticket1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Screen;
import com.vijay.book_movie_ticket1.entity.Seat;


public interface SeatRepository extends JpaRepository<Seat, Long> {
	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);
	Optional<Seat> findBySeatNumber(String seatNumber);
}

