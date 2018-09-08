package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class DeletionFormActivity extends DaggerAppCompatActivity {

    public static final long IDENTIFIER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletion_form);
    }
}
