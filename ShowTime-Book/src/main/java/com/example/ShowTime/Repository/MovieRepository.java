package com.example.ShowTime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShowTime.Models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Movie findByMovieName(String name);

}
