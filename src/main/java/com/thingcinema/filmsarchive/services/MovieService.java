package com.thingcinema.filmsarchive.services;


import com.thingcinema.filmsarchive.models.Movie;

import java.util.List;

public interface MovieService {

    void createMovie(Movie movie);
    List<Movie> getMovies();
    Movie getMovieByName(String name);
    void updateMovie(String name, Movie movie);
    void deleteMovie(String name);

}
