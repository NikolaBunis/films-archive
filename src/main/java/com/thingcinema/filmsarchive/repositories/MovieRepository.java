package com.thingcinema.filmsarchive.repositories;

import com.thingcinema.filmsarchive.models.Movie;

import java.util.List;

public interface MovieRepository {

    void createMovie(Movie movie);
    List<Movie> getMovies();
    Movie getMovieById(int id);
    void deleteMovie(int id);

}
