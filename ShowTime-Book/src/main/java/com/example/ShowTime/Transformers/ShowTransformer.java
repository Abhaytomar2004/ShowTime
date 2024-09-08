package com.example.ShowTime.Transformers;


import com.example.ShowTime.Dtos.RequestDto.AddShowDto;
import com.example.ShowTime.Models.Show;

public class ShowTransformer {
    public static Show convertDtoToEntity(AddShowDto addShowDto){

        Show show = Show.builder().time(addShowDto.getShowStartTime())
                .date(addShowDto.getShowDate()).build();

        return show;

    }
}
