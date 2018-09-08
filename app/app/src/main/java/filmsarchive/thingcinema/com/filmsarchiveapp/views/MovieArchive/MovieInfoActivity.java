package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class MovieInfoActivity extends DaggerAppCompatActivity {

    @BindView(R.id.movie_description)
    TextView mMovieDescription;
    @BindView(R.id.movie_poster_image)
    ImageView mMoviePosterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);

        ButterKnife.bind(this);

        Intent intent = getIntent();

//the string keys in this activity need to be the same as the "putExtra" string keys
        String picUrl = intent.getStringExtra("moviePosterImage");


        String text = intent.getStringExtra("movieDescription");


        setPicture(picUrl);
        setText(text);


    }

    private void setText(String text) {

        //  mMovieDescription = findViewById(R.id.movie_description);
        mMovieDescription.setText(text);

    }

    private void setPicture(String picUrl) {

        //mMoviePosterImage = findViewById(R.id.movie_poster);

        Picasso.get().load(picUrl)
                .placeholder(R.drawable.loader)
                .fit()
                .centerCrop().into(mMoviePosterImage);


    }


}

