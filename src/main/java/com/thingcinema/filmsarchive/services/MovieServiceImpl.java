package com.thingcinema.filmsarchive.services;

import com.thingcinema.filmsarchive.models.Movie;
import com.thingcinema.filmsarchive.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository repository;

    @Autowired
    public MovieServiceImpl(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createMovie(Movie movie) {
        repository.createMovie(movie);
    }

    @Override
    public Map<String, Movie> getMovies() {
        return repository.getMovies();
    }

    @Override
    public Movie getMovieByName(String name) {
      return repository.getMovieByName(name);
    }

    @Override
    public void updateMovie(String name, Movie movie) {
         repository.updateMovie(name, movie);
    }

    @Override
    public void deleteMovie(String name) {
        repository.deleteMovie(name);
    }
}
