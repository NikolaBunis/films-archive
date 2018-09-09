package filmsarchive.thingcinema.com.filmsarchiveapp.diconfig;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import dagger.Module;
import dagger.Provides;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.MoviesAdapter;

@Module
public class ViewsModule {
    @Provides
    public RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> movieArrayAdapter(Context context) {
        return new MoviesAdapter();
    }
}

