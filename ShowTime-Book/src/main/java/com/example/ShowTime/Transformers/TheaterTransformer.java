package com.example.ShowTime.Transformers;

import com.example.ShowTime.Dtos.RequestDto.TheaterEntryDto;
import com.example.ShowTime.Models.Theater;

public class TheaterTransformer {
    public static Theater convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        Theater theater = Theater.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

        return theater;
    }
}
