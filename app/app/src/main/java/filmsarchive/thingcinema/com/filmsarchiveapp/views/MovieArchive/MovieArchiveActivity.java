package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class MovieArchiveActivity extends DaggerAppCompatActivity {

    @Inject
    DrawerAndTitleFragment mDrawerFragment;

    @Inject
    MovieArchiveFragment mMainFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_archive);

        ButterKnife.bind(this);

        setupDrawer();
        setupMainFragment();


    }

    private void setupDrawer() {
        getFragmentManager().beginTransaction().replace(R.id.drawer_toolbar, mDrawerFragment).commit();
    }

    private void setupMainFragment() {

        getFragmentManager().beginTransaction().replace(R.id.main_fragment, mMainFragment).commit();

    }


}
