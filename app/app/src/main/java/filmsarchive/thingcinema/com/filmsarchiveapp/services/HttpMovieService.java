package filmsarchive.thingcinema.com.filmsarchiveapp.services;

import java.util.List;

import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.HttpRepository;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.base.Repository;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.base.MovieService;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.base.Validator;

public class HttpMovieService implements MovieService {

    private final Repository<Movie> mMoviesRepository;
    private final Validator<Movie> mMovieValidator;

    public HttpMovieService(Repository<Movie> moviesRepository, Validator<Movie> movieValidator) {
        mMoviesRepository = moviesRepository;
        mMovieValidator = movieValidator;
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

        if (!mMovieValidator.isValid(movie)) {
            throw new IllegalArgumentException("Movie is invalid");
        }


        return mMoviesRepository.add(movie);
    }

    @Override
    public Movie deleteMovieById(int id) throws Exception {
        return mMoviesRepository.deleteById(id);
    }
}
