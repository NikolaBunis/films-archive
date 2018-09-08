package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.MovieValidator;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.base.Validator;

@Module
public class ValidatorsModule {
    @Provides
    @Singleton
    public Validator<Movie> superheroValidator() {
        return new MovieValidator();
    }
}

