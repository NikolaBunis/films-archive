package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.parsers.GsonJsonParser;
import filmsarchive.thingcinema.com.filmsarchiveapp.parsers.base.JsonParser;

@Module
public class ParserModule {
    @Provides
    public JsonParser<Movie> superheroJsonParser() {
        return new GsonJsonParser<>(Movie.class, Movie[].class);
    }
}

