package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import filmsarchive.thingcinema.com.filmsarchiveapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieArchiveFragment extends Fragment {

    @Inject
    public MovieArchiveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_archive, container, false);
    }

}
