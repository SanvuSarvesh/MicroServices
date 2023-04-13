package com.example.Movie.Controller;

import com.example.Movie.Model.Movies;
import com.example.Movie.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public Movies addMovie(@RequestBody Movies movies){
        return movieService.addMovie(movies);
    }

    @GetMapping("/getAll")
    public List<Movies> getAllMovie(){
        return movieService.getAllMovies();
    }

    @GetMapping("/getOne{id}")
    public Movies getOneMovie(@PathVariable("id") String movieId ){
        return movieService.getMovieById(movieId);
    }

}
