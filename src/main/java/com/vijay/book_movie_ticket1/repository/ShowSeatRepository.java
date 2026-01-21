package com.vijay.book_movie_ticket1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Seat;
import com.vijay.book_movie_ticket1.entity.ShowSeat;


public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
	List<ShowSeat> findBySeatIn(List<Seat> seats);
}
