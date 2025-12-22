package com.vijay.book_movie_ticket1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.Screen;
import com.vijay.book_movie_ticket1.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);

}
