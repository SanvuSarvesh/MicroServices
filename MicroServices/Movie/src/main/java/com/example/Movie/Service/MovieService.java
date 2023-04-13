package com.example.Movie.Service;

import com.example.Movie.Model.Movies;
import com.example.Movie.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public Movies addMovie(Movies movies){
        Movies movies1 = movieRepository.save(movies);
        return movies1;
        //return new ResponseEntity<>("Movie added.", HttpStatus.CREATED);
    }

    public List<Movies> getAllMovies(){
        List<Movies> moviesList = movieRepository.findAll();
        return moviesList;
    }
    public Movies getMovieById(String movieName){
        Movies movie = movieRepository.findByMovieName(movieName);
        return movie;
    }
}
