package com.tec._6._2.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tec._6._2.movies.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long>{

}
