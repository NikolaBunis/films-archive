package filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage;

import android.content.Context;
import android.content.Intent;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MovieArchiveActivity;

public class HomePagePresenter implements HomePageContracts.Presenter {


    private HomePageContracts.View mView;
    private String backgroundImageURL = "https://firebasestorage.googleapis.com/v0/b/nbateamwiki.appspot.com/o/ProjectThingCinema%2FFilm.-Movie-clapper-and-film-reel-on-a-wooden-background-WW-56277468.jpeg?alt=media&token=5634610d-122e-4c6f-8683-80b48bed3c51";

    @Override
    public void subscribe(HomePageContracts.View view) {

        mView = view;
    }

    @Override
    public String addBackgroundImage() {

        return backgroundImageURL;

    }


    //not sure how to implement the business logic in here

}
