package com.example.ShowTime.Models;

import com.example.ShowTime.Enums.SeatType;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "theater_seats")
@Data
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn
    private Theater theater;
}
