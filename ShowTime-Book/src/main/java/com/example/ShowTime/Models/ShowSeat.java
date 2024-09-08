package com.example.ShowTime.Models;

import com.example.ShowTime.Enums.SeatType;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="show_seats")
@Data
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private int price; //Price stored for each seat..

    private boolean isAvailable;

    private boolean isFoodAttached;

    @ManyToOne
    @JoinColumn
    private Show show;
}
