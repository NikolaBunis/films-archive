package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage.HomePageActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveActivity;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(/*modules = TasksModule.class*/)
    abstract HomePageActivity homePageActivity();

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract MovieArchiveActivity movieArchiveActivity();


    /*
    @ActivityScoped
    @ContributesAndroidInjector(modules = StatisticsModule.class)
    abstract StatisticsActivity statisticsActivity();
    @ActivityScoped
    @ContributesAndroidInjector(modules = TaskDetailPresenterModule.class)
    abstract TaskDetailActivity taskDetailActivity();
*/
}