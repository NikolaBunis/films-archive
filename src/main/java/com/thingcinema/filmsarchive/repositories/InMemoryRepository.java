package com.thingcinema.filmsarchive.repositories;

import com.thingcinema.filmsarchive.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryRepository implements MovieRepository {

    private Map<String, Movie> allMovies = new HashMap<>();


    public InMemoryRepository(){

        allMovies.put("Test Name 1", new Movie("Test Name 1", "Test Description 1", "Test Image Url 1"));
        allMovies.put("Test Name 2", new Movie("Test Name 2", "Test Description 2", "Test Image Url 2"));
        allMovies.put("Test Name 3", new Movie("Test Name 3", "Test Description 3", "Test Image Url 3"));
        allMovies.put("Test Name 4", new Movie("Test Name 4", "Test Description 4", "Test Image Url 4"));
        allMovies.put("Test Name 5", new Movie("Test Name 5", "Test Description 5", "Test Image Url 5"));
    }

    @Override
    public void createMovie(Movie movie) {
        allMovies.put(movie.getName(), movie);
    }

    @Override
    public Map<String, Movie> getMovies() {
        return allMovies;
    }

    @Override
    public Movie getMovieByName(String name) {
        return allMovies.get(name);
    }

    @Override
    public void updateMovie(String name, Movie movie) {

    }

    @Override
    public void deleteMovie(String name) {
        allMovies.remove(name);
    }
}
