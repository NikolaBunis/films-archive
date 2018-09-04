package com.thingcinema.filmsarchive.services;


import com.thingcinema.filmsarchive.models.Movie;

import java.util.List;

public interface MovieService {

    void createMovie(Movie movie);
    List<Movie> getMovies();
    Movie getMovieById(int id);
    void deleteMovie(int id);

}
