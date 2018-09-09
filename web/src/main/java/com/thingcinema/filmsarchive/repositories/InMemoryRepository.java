package com.thingcinema.filmsarchive.repositories;

import com.thingcinema.filmsarchive.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepository implements MovieRepository {

    private List<Movie> allMovies = new ArrayList<>();


    public InMemoryRepository(){

        allMovies.add(new Movie("Fight Club", "Fight Club is a 1999 film based on Chuck Palahniuk‘s 1996 novel of the same name. The film was directed by David Fincher and stars Brad Pitt, Edward Norton, and Helena Bonham Carter. Norton plays the unnamed protagonist, referred to as the narrator, who is discontent with his white-collar job. He forms a \"fight club\" with soap maker Tyler Durden, played by Pitt, and they are joined by men who also want to fight recreationally. The narrator becomes embroiled in a relationship with Durden and a dissolute woman, Marla Singer, played by Bonham Carter. ", "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",1));
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
