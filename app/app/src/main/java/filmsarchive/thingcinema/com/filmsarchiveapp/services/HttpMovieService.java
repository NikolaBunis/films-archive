package filmsarchive.thingcinema.com.filmsarchiveapp.services;

import java.util.List;

import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.HttpRepository;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.base.Repository;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.base.MovieService;

public class HttpMovieService implements MovieService {

    private final Repository<Movie> mMoviesRepository;

    public HttpMovieService(Repository<Movie> moviesRepository) {
        mMoviesRepository = moviesRepository;
    }

    @Override
    public List<Movie> getAllMovies() throws Exception {
        return mMoviesRepository.getAll();
    }

    @Override
    public Movie getMovieInfoById(int id) throws Exception {
        return mMoviesRepository.getById(id);
    }

    @Override
    public Movie createMovie(Movie movie) throws Exception {
        return mMoviesRepository.add(movie);
    }

    @Override
    public Movie deleteMovieById(int id) throws Exception {
        return mMoviesRepository.deleteById(id);
    }
}
