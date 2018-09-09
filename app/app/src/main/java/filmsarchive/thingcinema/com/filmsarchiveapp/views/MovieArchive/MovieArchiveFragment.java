package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieArchiveFragment extends Fragment implements MovieArchiveContracts.View, MoviesAdapter.OnMovieClickListener {

    @BindView(R.id.listView_movies)
    RecyclerView mMoviesView;

    @BindView(R.id.loading)
    ProgressBar mLoadingView;

    @Inject
    MoviesAdapter mMoviesAdapter;

    private MovieArchiveContracts.Presenter mPresenter;
    private GridLayoutManager mMoviesViewLayoutManager;

    @Inject
    public MovieArchiveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie_archive, container, false);

        ButterKnife.bind(this, view);

        mMoviesAdapter.setOnMovieClickListener(this);
        mMoviesView.setAdapter(mMoviesAdapter);
        mMoviesViewLayoutManager = new GridLayoutManager(getContext(), 2);
        mMoviesView.setLayoutManager(mMoviesViewLayoutManager);

        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        mPresenter.subscribe(this);
        mPresenter.loadMovies();
    }

    @Override
    public void setPresenter(MovieArchiveContracts.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showMovies(List<Movie> movies) {
        mMoviesAdapter.clear();
        mMoviesAdapter.addAll(movies);
        mMoviesAdapter.notifyDataSetChanged();
    }

    @Override
    public void showEmptyList() {
        Toast.makeText(getContext(),
                "NO MOVIES YET",
                Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void showError(Throwable e) {
        Toast.makeText(getContext(), "Error: " + e.getMessage(), Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void showLoading() {
        mMoviesView.setVisibility(View.GONE);
        mLoadingView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mMoviesView.setVisibility(View.VISIBLE);
        mLoadingView.setVisibility(View.GONE);
    }

    @Override
    public void showMovieInfo(Movie movie) {
        Intent intent = new Intent(getContext(), MovieInfoActivity.class);
        intent.putExtra("Movie Name", movie.getName());
        intent.putExtra("moviePosterImage", movie.getUrlImage());
        intent.putExtra("movieDescription", movie.getDescription());

        startActivity(intent);


    }

    @Override
    public void onClick(Movie movie) {
        mPresenter.selectMovie(movie);
    }
}
