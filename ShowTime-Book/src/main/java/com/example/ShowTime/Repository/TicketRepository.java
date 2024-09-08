package com.example.ShowTime.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShowTime.Models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
