package com.example.ShowTime.Dtos.RequestDto;

import lombok.Data;

@Data
public class ShowSeatsDto {
    private int showId;
    private int priceForClassicSeats;
    private int priceForPremiumSeats;
}
