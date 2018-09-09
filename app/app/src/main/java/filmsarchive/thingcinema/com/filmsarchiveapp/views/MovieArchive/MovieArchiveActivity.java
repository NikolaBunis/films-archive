package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.app.FragmentTransaction;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class MovieArchiveActivity extends DaggerAppCompatActivity {

    @Inject
    DrawerAndTitleFragment mDrawerFragment;

    @Inject
    MovieArchiveFragment mMovieArchiveFragment;

    @Inject
    MovieArchiveContracts.Presenter mMovieArchivePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_archive);
        ButterKnife.bind(this);
        setupDrawer();


        mMovieArchiveFragment.setPresenter(mMovieArchivePresenter);

        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment, mMovieArchiveFragment);

        transaction.commit();

    }

    private void setupDrawer() {
        getFragmentManager().beginTransaction().replace(R.id.drawer_toolbar, mDrawerFragment).commit();
    }



}
