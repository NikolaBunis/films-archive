package com.thingcinema.filmsarchive.controllers;

import com.thingcinema.filmsarchive.models.Movie;
import com.thingcinema.filmsarchive.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public Map<String, Movie> getMovies(){
        return service.getMovies();
    }

    @GetMapping("/{name}")
    public Movie getMovieById(@PathVariable String name) {
        return service.getMovieByName(name);
    }

    @PostMapping
    public void createMovie(@RequestBody Movie movie) {
        service.createMovie(movie);
    }

    @PutMapping
    public void updateMovie(@PathVariable String name, @RequestBody Movie movie) {
        service.updateMovie(name, movie);
    }

    @DeleteMapping
    public void deleteMovie(@PathVariable String name) {
        service.deleteMovie(name);
    }

}
