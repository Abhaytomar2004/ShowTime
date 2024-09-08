package com.example.ShowTime.Dtos.RequestDto;

import lombok.Data;

import java.sql.Date;
import java.time.LocalTime;

@Data
public class AddShowDto {
    private LocalTime showStartTime;
    private Date showDate;
    private int theaterId;
    private int movieId;
}
