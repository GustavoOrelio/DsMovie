package com.gustavoorelio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoorelio.dsmovie.entities.Score;
import com.gustavoorelio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
