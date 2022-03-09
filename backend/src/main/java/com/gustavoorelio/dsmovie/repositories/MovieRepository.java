package com.gustavoorelio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoorelio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
