package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage.HomePageActivity;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(/*modules = TasksModule.class*/)
    abstract HomePageActivity homePageActivity();

  /*  @ActivityScoped
    @ContributesAndroidInjector(modules = AddEditTaskModule.class)
    abstract AddEditTaskActivity addEditTaskActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = StatisticsModule.class)
    abstract StatisticsActivity statisticsActivity();
    @ActivityScoped
    @ContributesAndroidInjector(modules = TaskDetailPresenterModule.class)
    abstract TaskDetailActivity taskDetailActivity();
*/
}