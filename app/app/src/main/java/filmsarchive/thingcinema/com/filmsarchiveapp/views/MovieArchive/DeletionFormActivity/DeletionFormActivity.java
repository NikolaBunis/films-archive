package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.DeletionFormActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.Constants;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;
import filmsarchive.thingcinema.com.filmsarchiveapp.async.AsyncSchedulerProvider;
import filmsarchive.thingcinema.com.filmsarchiveapp.async.base.SchedulerProvider;
import filmsarchive.thingcinema.com.filmsarchiveapp.http.HttpRequester;
import filmsarchive.thingcinema.com.filmsarchiveapp.http.OkHttpHttpRequester;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.parsers.GsonJsonParser;
import filmsarchive.thingcinema.com.filmsarchiveapp.parsers.base.JsonParser;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.HttpRepository;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.base.Repository;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.HttpMovieService;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.base.MovieService;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.MovieValidator;
import filmsarchive.thingcinema.com.filmsarchiveapp.validators.base.Validator;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;

public class DeletionFormActivity extends DaggerAppCompatActivity {

    public static final long IDENTIFIER = 2;

    //Iterating through the whole MVP logic :D
    JsonParser<Movie> parser = new GsonJsonParser<>(Movie.class, Movie[].class);
    HttpRequester requester = new OkHttpHttpRequester();
    String serverURL = Constants.BASE_SERVER_URL;
    Repository<Movie> repository = new HttpRepository<Movie>(requester, serverURL, parser);
    Validator<Movie> validator = new MovieValidator();
    MovieService mMovieService = new HttpMovieService(repository, validator);
    SchedulerProvider mSchedulerProvider = new AsyncSchedulerProvider();
    ArrayAdapter movieAdapter;

    @BindView(R.id.movie_list)
    ListView mMovieList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletion_form);

        ButterKnife.bind(this);

        movieAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);

        loadMovies();

        mMovieList.setAdapter(movieAdapter);


    }

    private void loadMovies() {
        Disposable observable = Observable.create((ObservableOnSubscribe<List<Movie>>) emitter -> {
            List<Movie> movies = mMovieService.getAllMovies();
            emitter.onNext(movies);
            emitter.onComplete();
        }).subscribeOn(mSchedulerProvider.background()).observeOn(mSchedulerProvider.ui())
                .subscribe(this::addMovieListToAdapter);
    }

    private void addMovieListToAdapter(List<Movie> movies) {
        movieAdapter.addAll(movies);
    }
}
