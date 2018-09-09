package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.http.HttpRequester;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.parsers.base.JsonParser;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.HttpRepository;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.base.Repository;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public Repository<Movie> superheroRepository(
            @Named("baseServerUrl") String baseServerUrl,
            HttpRequester httpRequester,
            JsonParser<Movie> jsonParser
    ) {
        String url = baseServerUrl + "/movies";
        return new HttpRepository<Movie>(httpRequester, url, jsonParser);
    }


}
