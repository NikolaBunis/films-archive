package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.Constants;
import filmsarchive.thingcinema.com.filmsarchiveapp.http.HttpRequester;
import filmsarchive.thingcinema.com.filmsarchiveapp.http.OkHttpHttpRequester;

@Module
public class HttpModule {
    @Provides
    public HttpRequester httpRequester() {
        return new OkHttpHttpRequester();
    }

    @Provides
    @Named("baseServerUrl")
    public String baseServerUrl() {
        return Constants.BASE_SERVER_URL;
    }
}

