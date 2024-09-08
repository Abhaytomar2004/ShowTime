package com.example.ShowTime.Dtos.RequestDto;

import lombok.Data;

import java.sql.Date;

import com.example.ShowTime.Enums.Genre;
import com.example.ShowTime.Enums.Language;

@Data
public class MovieEntryDto {
    private String movieName;
    private double duration;
    private double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
