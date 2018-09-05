package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;


import java.util.List;

import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;

public interface MovieArchiveContracts {


    interface View{

        void setPresenter(Presenter presenter);

        void showMovies(List<Movie> movies);


    }

    interface Presenter{

        void subscribe(View view);

    }


}
