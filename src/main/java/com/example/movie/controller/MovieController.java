package com.example.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.movie.Movie;
import com.example.movie.MovieH2Service;

@RestController
public class MovieController {
  @Autowired
  public com.example.movie.service.MovieH2Service movieService;

  @GetMapping("/movies")

  public ArrayList<Movie> getMovies() {
    return movieService.getMovies();
  }

  @PostMapping("/movies")
  public Movie addMovie(@RequestBody Movie movie) {
    return movieService.addMovie(movie);
  }

  @GetMapping("/movies/{movieId}")
  public Movie getMovieById(@PathVariable("movieId") int movieId) {
    return movieService.getMovieById(movieId);
  }

  @PutMapping("/movies/{movieId}")
  public Movie updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
    return movieService.updateMovie(movieId, movie);
  }
}