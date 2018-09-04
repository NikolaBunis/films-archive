package com.thingcinema.filmsarchive.services;

import com.thingcinema.filmsarchive.models.Movie;
import com.thingcinema.filmsarchive.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Movie> getMovies() {
        return repository.getMovies();
    }

    @Override
    public Movie getMovieById(int id) {
      return repository.getMovieById(id);
    }


    @Override
    public void deleteMovie(int id) {
        repository.deleteMovie(id);
    }
}
