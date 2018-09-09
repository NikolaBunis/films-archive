package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;
import filmsarchive.thingcinema.com.filmsarchiveapp.models.Movie;
import io.reactivex.annotations.NonNull;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    private List<Movie> mMovies;
    private OnMovieClickListener mOnMovieClickListener;

    @Inject
    public MoviesAdapter(){
        mMovies = new ArrayList<>();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(view);
    }

    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position){
        holder.setOnClickListener(mOnMovieClickListener);
        holder.bind(mMovies.get(position));
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public Movie getItem(int position) {
        return mMovies.get(position);
    }

    public void clear() {
        mMovies.clear();
    }

    public void addAll(List<Movie> movies) {
        mMovies.addAll(movies);
    }

    public void setOnMovieClickListener(OnMovieClickListener onMovieClickListener){
        this.mOnMovieClickListener = onMovieClickListener;
    }

    interface OnMovieClickListener {
        void onClick(Movie movie);
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.textView_name)
        TextView mNameTextView;

        @BindView(R.id.textView_description)
        TextView mDescriptionTextView;

        @BindView(R.id.imageView_movie)
        ImageView mMovieImageView;

        private OnMovieClickListener mOnClickListener;
        private Movie mMovie;

        MovieViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }

        void bind(Movie movie){
            mNameTextView.setText(movie.getName());
            mDescriptionTextView.setText(movie.getDescription());
            Picasso.get().load(movie.getUrlImage()).into(mMovieImageView);
            mMovie = movie;
        }

        @OnClick
        public void OnClick(OnMovieClickListener onClickListener){
            mOnClickListener.onClick(mMovie);
        }

        public void setOnClickListener(OnMovieClickListener onClickListener){
            mOnClickListener = onClickListener;
        }

    }
}
