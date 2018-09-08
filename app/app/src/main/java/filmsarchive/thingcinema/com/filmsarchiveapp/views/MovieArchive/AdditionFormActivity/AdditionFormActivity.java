package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.AdditionFormActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class AdditionFormActivity extends DaggerAppCompatActivity {

    public static final long IDENTIFIER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_form);
    }
}
