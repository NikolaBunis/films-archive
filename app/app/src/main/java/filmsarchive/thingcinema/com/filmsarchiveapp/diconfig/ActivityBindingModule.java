package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage.HomePageActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.AdditionFormActivity.AdditionFormActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.DeletionFormActivity.DeletionFormActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieInfoActivity;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(/*modules = TasksModule.class*/)
    abstract HomePageActivity homePageActivity();

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract MovieArchiveActivity movieArchiveActivity();

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract MovieInfoActivity  movieInfoActivity();

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract AdditionFormActivity additionFormActivity();

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract DeletionFormActivity deletionFormActivity();
    /*
    @ActivityScoped
    @ContributesAndroidInjector(modules = StatisticsModule.class)
    abstract StatisticsActivity statisticsActivity();
    @ActivityScoped
    @ContributesAndroidInjector(modules = TaskDetailPresenterModule.class)
    abstract TaskDetailActivity taskDetailActivity();
*/
}