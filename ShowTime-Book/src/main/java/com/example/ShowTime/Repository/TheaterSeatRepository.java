package com.example.ShowTime.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShowTime.Models.TheaterSeat;

public interface TheaterSeatRepository extends JpaRepository<TheaterSeat,Integer> {

}
