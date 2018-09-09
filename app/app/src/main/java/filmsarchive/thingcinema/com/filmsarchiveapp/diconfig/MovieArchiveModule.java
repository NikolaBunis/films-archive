package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveContracts;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveFragment;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchivePresenter;

@Module
public abstract class MovieArchiveModule {

        @FragmentScoped
        @ContributesAndroidInjector
        abstract MovieArchiveFragment movieArchiveFragment();

        @ActivityScoped
        @Binds
        abstract MovieArchiveContracts.Presenter movieArchivePresenter(MovieArchivePresenter presenter);
    }


