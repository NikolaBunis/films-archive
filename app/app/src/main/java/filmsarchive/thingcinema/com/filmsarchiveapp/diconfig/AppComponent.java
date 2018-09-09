package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import filmsarchive.thingcinema.com.filmsarchiveapp.AndroidApplication;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class,
        AsyncModule.class,
        HttpModule.class,
        ParserModule.class,
        ServicesModule.class,
        ValidatorsModule.class,
        ViewsModule.class,
        MovieArchivePresenterModule.class,
        RepositoryModule.class


})
public interface AppComponent extends AndroidInjector<AndroidApplication> {

    //  TasksRepository getTasksRepository();

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}