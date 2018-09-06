package filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class HomePageActivity extends AppCompatActivity {

    Fragment mHomePageFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        setMainFragment();


    }

    private void setMainFragment() {
        mHomePageFragment = HomePageFragment.newInstance();

        getFragmentManager().beginTransaction().replace(R.id.main_fragment, mHomePageFragment).commit();


    }
}
