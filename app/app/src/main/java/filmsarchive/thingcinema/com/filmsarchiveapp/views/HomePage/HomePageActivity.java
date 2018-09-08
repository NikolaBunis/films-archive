package filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class HomePageActivity extends DaggerAppCompatActivity {

    @Inject
    HomePageFragment mHomePageFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ButterKnife.bind(this);

        setMainFragment();


    }

    private void setMainFragment() {
       // mHomePageFragment = HomePageFragment.newInstance();

        getFragmentManager().beginTransaction().replace(R.id.main_fragment, mHomePageFragment).commit();


    }
}
