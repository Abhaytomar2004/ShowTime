package com.example.ShowTime.Services;


import com.example.ShowTime.Dtos.RequestDto.MovieEntryDto;
import com.example.ShowTime.Exception.MovieAlreadyPresentWithSameNameAndLanguage;
import com.example.ShowTime.Models.Movie;
import com.example.ShowTime.Repository.MovieRepository;
import com.example.ShowTime.Repository.ShowRepository;
import com.example.ShowTime.Transformers.MovieTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ShowRepository showRepository;

    public String addMovie(MovieEntryDto movieEntryDto) throws MovieAlreadyPresentWithSameNameAndLanguage {


        Optional<Movie> movieOptional= Optional.ofNullable(movieRepository.findByMovieName(movieEntryDto.getMovieName()));
        if(movieOptional.isPresent()){
            throw new MovieAlreadyPresentWithSameNameAndLanguage("Movie is Already present by same name");
        }


        Movie movie = MovieTransformer.convertDtoToEntity(movieEntryDto) ;
        movieRepository.save(movie);
        return "Movie added successfully";

    }

}
