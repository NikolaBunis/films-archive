package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.AdditionFormActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;

public class AdditionFormActivity extends DaggerAppCompatActivity {

    @BindView(R.id.movie_name_box)
    EditText mMovieNameBox;

    @BindView(R.id.movie_url_box)
    EditText mMovieUrlBox;

    @BindView(R.id.movie_description_box)
    EditText mMovieDescription;

    private Movie mCreatedMovie;
    public static final long IDENTIFIER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_form);

        ButterKnife.bind(this);

        mCreatedMovie = new Movie();


        mMovieNameBox.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
               if(i == EditorInfo.IME_ACTION_NEXT){
                   String inputText = textView.getText().toString();

                   mCreatedMovie.setName(inputText);
               }
                return false;
            }
        });

        mMovieUrlBox.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_NEXT){
                    String inputText = textView.getText().toString();

                    mCreatedMovie.setUrlImage(inputText);
                }
                return false;
            }
        });


mMovieDescription.setOnEditorActionListener(new TextView.OnEditorActionListener() {
    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if(i == EditorInfo.IME_ACTION_DONE){
            String inputText = textView.getText().toString();

            mCreatedMovie.setDescription(inputText);

        }

        return true;
    }
});




    }
}
