package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import java.util.List;

import io.reactivex.Observable;


import javax.inject.Inject;

import filmsarchive.thingcinema.com.filmsarchiveapp.async.base.SchedulerProvider;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import filmsarchive.thingcinema.com.filmsarchiveapp.services.base.MovieService;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;

public class MovieArchivePresenter implements MovieArchiveContracts.Presenter{

    private final MovieService mMovieService;
    private final SchedulerProvider mSchedulerProvider;
    private MovieArchiveContracts.View mView;

    @Inject
    public MovieArchivePresenter(MovieService mMovieService, SchedulerProvider mSchedulerProvider) {
        this.mMovieService = mMovieService;
        this.mSchedulerProvider = mSchedulerProvider;
    }

    @Override
    public void subscribe(MovieArchiveContracts.View view) {
        mView = view;
    }

    @Override
    public void loadMovies() {
        mView.showLoading();
        Disposable observable = Observable.create((ObservableOnSubscribe<List<Movie>>) emitter ->{
            List<Movie> movies = mMovieService.getAllMovies();
            emitter.onNext(movies);
            emitter.onComplete();
        }).subscribeOn(mSchedulerProvider.background()).observeOn(mSchedulerProvider.ui()).doFinally(mView::hideLoading).subscribe(
                this::presentMoviesToView, error -> mView.showError(error)
        );
    }

    private void presentMoviesToView(List<Movie> movies) {
        if(movies.isEmpty()){
            mView.showEmptyList();
        }else{
            mView.showMovies(movies);
        }
    }

    @Override
    public void selectMovie(Movie movie) {
        mView.showMovieInfo(movie);
    }
}
