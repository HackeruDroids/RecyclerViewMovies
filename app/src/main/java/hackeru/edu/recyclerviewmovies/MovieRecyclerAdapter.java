package hackeru.edu.recyclerviewmovies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by hackeru on 25/05/2017.
 */

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private List<Movie> movies = MoviesDataSource.getMovies();
    private LayoutInflater inflater;

    //Constructor that takes the inflater.
    public MovieRecyclerAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    //Create an instance of MovieViewHolder and return it.
    //take an xml convert to a view->use the inflater.
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.movie_item, parent, false);
        MovieViewHolder holder = new MovieViewHolder(v);
        return holder;
    }

    //Data Binding!
    @Override
    public void onBindViewHolder(MovieViewHolder h, int position) {
        Movie m = movies.get(position);
        h.tvTitle.setText(m.getTitle());
        h.tvRating.setText(String.valueOf(m.getRating()));
        h.ivThumbnail.setImageResource(m.getThumbnailResId());

        String[] genres = m.getGenres();
        String s = Arrays.toString(genres); //[Drama,Action ,Comedy]
        //StringJoiner j = new StringJoiner(",", "[", "]");

        h.tvGenre.setText(s);
        h.tvYear.setText(String.valueOf(m.getYear()));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
