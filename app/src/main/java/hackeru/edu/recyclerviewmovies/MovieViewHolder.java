package hackeru.edu.recyclerviewmovies;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A ViewHolder is a class that holds the Views of the itemView.
 * It's main job is to hold all the views as fields (class members)
 * And to store a reference to the Views.
 * findViewById helps us get a reference as usual.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder {
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
    }
}
