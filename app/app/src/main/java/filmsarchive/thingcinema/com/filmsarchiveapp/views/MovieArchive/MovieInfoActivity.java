package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import filmsarchive.thingcinema.com.filmsarchiveapp.R;

public class MovieInfoActivity extends AppCompatActivity {

    private TextView mMovieDescription;
    private ImageView mMoviePosterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);

        Intent intent = getIntent();

//the string keys in this activity need to be the same as the "putExtra" string keys
        String picUrl = intent.getStringExtra("moviePosterImage");


        String text = intent.getStringExtra("movieDescription");

        setPicture(picUrl);
        setText(text);


    }

    private void setText(String text) {

        mMovieDescription = findViewById(R.id.player_info_text);
        mMovieDescription.setText(text);

    }

    private void setPicture(String picUrl) {

        mMoviePosterImage = findViewById(R.id.player_picture);

        Picasso.get().load(picUrl)
                .placeholder(R.drawable.loader)
                .fit()
                .centerCrop().into(mMoviePosterImage);


    }


    }

