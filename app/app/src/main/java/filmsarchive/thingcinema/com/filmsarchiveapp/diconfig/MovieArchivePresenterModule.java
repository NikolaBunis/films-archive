package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.async.base.SchedulerProvider;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.base.MovieService;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveContracts;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchivePresenter;

@Module
public class MovieArchivePresenterModule {


    @Provides
    MovieArchiveContracts.Presenter movieArchivePresenter(MovieArchivePresenter presenter){

        return presenter;

    }


}
