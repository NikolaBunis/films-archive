package filmsarchive.thingcinema.com.filmsarchiveapp.services.base;

import java.util.List;

import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;

public interface MovieService {
    List<Movie> getAllMovies() throws Exception;

    Movie getMovieInfoById(int id) throws Exception;

    Movie createMovie(Movie movie) throws Exception;

    Movie deleteMovieById(int id) throws Exception;

}
