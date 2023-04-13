package com.example.Movie.Repository;

import com.example.Movie.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movies,String> {
    Movies findByMovieName(String movieName);
}
