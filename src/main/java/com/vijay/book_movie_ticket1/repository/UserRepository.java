package com.vijay.book_movie_ticket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
