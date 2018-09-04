package com.thingcinema.filmsarchive.repositories;

import com.thingcinema.filmsarchive.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepository implements MovieRepository {

    private List<Movie> allMovies = new ArrayList<>();


    public InMemoryRepository(){

        allMovies.add(new Movie("Test Name 1", "Test Description 1", "Test Image Url 1",1));
        allMovies.add( new Movie("Test Name 2", "Test Description 2", "Test Image Url 2",2));
        allMovies.add( new Movie("Test Name 3", "Test Description 3", "Test Image Url 3",3));
        allMovies.add( new Movie("Test Name 4", "Test Description 4", "Test Image Url 4", 4));
        allMovies.add( new Movie("Test Name 5", "Test Description 5", "Test Image Url 5", 5));
    }

    @Override
    public void createMovie(Movie movie) {
        Movie lastMovie = allMovies.get(allMovies.size()-1);
        movie.setId(lastMovie.getId()+1);
        allMovies.add(movie);
    }

    @Override
    public List<Movie> getMovies() {
        return allMovies;
    }

    @Override
    public Movie getMovieById(int id) {
        for (Movie movie : allMovies) {
            if(id == movie.getId()){
                return movie;
            }
        }
        return null;
    }

    @Override
    public void deleteMovie(int id) {
        for (Movie movie : allMovies) {
            if(id == movie.getId()){
                allMovies.remove(movie);
            }
        }
    }
}
