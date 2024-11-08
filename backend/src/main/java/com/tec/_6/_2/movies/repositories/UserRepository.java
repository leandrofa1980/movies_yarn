package com.tec._6._2.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tec._6._2.movies.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
