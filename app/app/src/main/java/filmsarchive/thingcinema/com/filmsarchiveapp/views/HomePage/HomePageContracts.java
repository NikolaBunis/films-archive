package filmsarchive.thingcinema.com.filmsarchiveapp.views.HomePage;

import android.content.Context;
import android.view.View;

public interface HomePageContracts {

    interface View{

        void setPresenter(Presenter presenter);

        void addBackgroundImage(android.view.View view);

        void addArchiveButton(android.view.View view);
    }

    interface Presenter{

        void subscribe(View view);

        String addBackgroundImage();

    }

}
