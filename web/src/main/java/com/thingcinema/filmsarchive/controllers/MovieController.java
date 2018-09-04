package com.thingcinema.filmsarchive.controllers;

import com.thingcinema.filmsarchive.models.Movie;
import com.thingcinema.filmsarchive.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<Movie> getMovies(){
        return service.getMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return service.getMovieById(id);
    }

    @PostMapping
    public void createMovie(@RequestBody Movie movie) {
        service.createMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id) {
        service.deleteMovie(id);
    }
}
