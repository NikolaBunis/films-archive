package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.async.AsyncSchedulerProvider;
import filmsarchive.thingcinema.com.filmsarchiveapp.async.base.SchedulerProvider;

@Module
public class AsyncModule {
    @Provides
    @Singleton
    public SchedulerProvider schedulerProvider() {
        return AsyncSchedulerProvider.getInstance();
    }
}

