package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;


import java.util.List;

import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;

public interface MovieArchiveContracts {


    interface View{

        void setPresenter(Presenter presenter);

        void showMovies(List<Movie> movies);

        void showEmptyList();

        void showError(Throwable e);

        void showLoading();

        void hideLoading();

        void showMovieInfo(Movie movie);

    }

    interface Presenter{

        void subscribe(View view);

        void loadMovies();

        void selectMovie(Movie movie);

    }


}
