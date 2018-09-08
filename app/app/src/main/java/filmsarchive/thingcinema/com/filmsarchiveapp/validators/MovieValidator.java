package filmsarchive.thingcinema.com.filmsarchiveapp.validators;

import filmsarchive.thingcinema.com.filmsarchiveapp.Constants;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.base.Validator;

public class MovieValidator implements Validator<Movie> {
    @Override
    public boolean isValid(Movie object) {
        return object != null &&
                isNameValid(object) &&
                isDescriptionValid(object);
    }

    private boolean isDescriptionValid(Movie object) {
        return object.getDescription().length() >= Constants.MOVIE_DESCRIPTION_MIN_LENGHT &&
                object.getDescription().length() <= Constants.MOVIE_DESCRIPTION_MAX_LENGHT;
    }

    private boolean isNameValid(Movie object) {
        return object.getName().length() >= Constants.MOVIE_NAME_MIN_LENGHT &&
                object.getName().length() <= Constants.MOVIE_NAME_MAX_LENGHT;
    }
}

