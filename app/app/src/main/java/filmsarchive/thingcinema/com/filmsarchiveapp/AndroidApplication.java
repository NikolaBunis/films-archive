package filmsarchive.thingcinema.com.filmsarchiveapp;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import filmsarchive.thingcinema.com.filmsarchiveapp.diconfig.DaggerAppComponent;


public class AndroidApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
       return DaggerAppComponent.builder().application(this).build();
    }
}

