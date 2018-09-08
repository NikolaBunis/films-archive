package filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerFragment;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment implements HomePageContracts.View {


    // private HomePageContracts.Presenter mPresenter;
    @BindView(R.id.background_image)
    ImageView mBackgroundImageView;
    @BindView(R.id.movie_archive_button)
    View mArchiveButton;

    @Inject
    public HomePageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        ButterKnife.bind(this, view);


        addBackgroundImage(view);
        addArchiveButton(view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();


        addBackgroundImage(getView());
        addArchiveButton(getView());

    }

    @Override
    public void setPresenter(HomePageContracts.Presenter presenter) {

        //    mPresenter = presenter;

    }

    @Override
    public void addBackgroundImage(View view) {


        //mBackgroundImageView = view.findViewById(R.id.background_image);

        Picasso.get()
                .load("https://firebasestorage.googleapis.com/v0/b/nbateamwiki.appspot.com/o/ProjectThingCinema%2FFilm.-Movie-clapper-and-film-reel-on-a-wooden-background-WW-56277468.jpeg?alt=media&token=5634610d-122e-4c6f-8683-80b48bed3c51")
                .fit()
                .into(mBackgroundImageView);

    }


    @Override
    public void addArchiveButton(View view) {

        //mArchiveButton = view.findViewById(R.id.movie_archive_button);

        mArchiveButton.setOnClickListener(item -> startMovieArchiveActivity());

    }

    private void startMovieArchiveActivity() {
        Intent intent = new Intent(getActivity(), MovieArchiveActivity.class);
        startActivity(intent);

    }

    public static Fragment newInstance() {
        return new HomePageFragment();
    }
}
