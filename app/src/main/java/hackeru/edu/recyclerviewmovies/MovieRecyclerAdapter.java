package hackeru.edu.recyclerviewmovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by hackeru on 25/05/2017.
 */

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder> {

    private final Context context;
    private List<Movie> movies = MoviesDataSource.getMovies();
    private LayoutInflater inflater;

    //Constructor that takes the inflater.
    public MovieRecyclerAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
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


    /**
     * A ViewHolder is a class that holds the Views of the itemView.
     * It's main job is to hold all the views as fields (class members)
     * And to store a reference to the Views.
     * findViewById helps us get a reference as usual.
     */

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvTitle, tvGenre, tvRating, tvYear;
        ImageView ivThumbnail;

        //Constructor that matches super:
        public MovieViewHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvGenre = (TextView) v.findViewById(R.id.tvGenre);
            tvRating = (TextView) v.findViewById(R.id.tvRating);
            tvYear = (TextView) v.findViewById(R.id.tvYear);
            ivThumbnail = (ImageView) v.findViewById(R.id.ivThumbnail);

            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Toast.makeText(context, movies.get(position).toString(), Toast.LENGTH_SHORT).show();
        }
    }

}
