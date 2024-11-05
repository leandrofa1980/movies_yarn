package com.tec._6._2.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tec._6._2.movies.entities.Score;
import com.tec._6._2.movies.entities.ScorePK;

public interface ScoreRepository  extends JpaRepository<Score, ScorePK>{

}
