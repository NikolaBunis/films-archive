package com.thingcinema.filmsarchive.repositories;

import com.thingcinema.filmsarchive.models.Movie;

import java.util.Map;

public interface MovieRepository {

    void createMovie(Movie movie);
    Map<String, Movie> getMovies();
    Movie getMovieByName(String name);
    void updateMovie(String name, Movie movie);
    void deleteMovie(String name);

}
