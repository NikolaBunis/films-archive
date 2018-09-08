package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.base.Repository;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.HttpMovieService;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.base.MovieService;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.base.Validator;

@Module
public class ServicesModule {
    @Provides
    public MovieService movieService(Repository<Movie> repository, Validator<Movie> validator) {
        return new HttpMovieService(repository, validator);
    }
}

