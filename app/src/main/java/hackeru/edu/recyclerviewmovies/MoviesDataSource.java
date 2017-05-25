package hackeru.edu.recyclerviewmovies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 25/05/2017.
 */

public class MoviesDataSource {
    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        //add the movies:
        for (int i = 0; i < 100; i++) {

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Dawn Of the planet of the apes",
                    2014,
                    8.3,
                    R.drawable.a1,
                    "Action", "Thriller", "Sci-Fi")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "District 9",
                    2009,
                    8,
                    R.drawable.a2,
                    "Action", "Sci-Fi", "Thriller")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Transformers: Age of Extinction",
                    2014,
                    6.3,
                    R.drawable.a3,
                    "Action", "Adventure", "Sci-Fi")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "X-Men: Days of Future Past",
                    2014,
                    8.4,
                    R.drawable.a4,
                    "Action", "Sci-Fi", "Thriller")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "The Machinist",
                    2004,
                    7.8,
                    R.drawable.a5,
                    "Drama", "Thriller")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "The Last Samurai",
                    2003,
                    7.7,
                    R.drawable.a6,
                    "Action", "Drama", "History")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "The Amazing Spider-Man 2",
                    2014,
                    7.3,
                    R.drawable.a7,
                    "Action", "Adventure", "Fantasy")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Tangled",
                    2010,
                    7.9,
                    R.drawable.a8,
                    "Action", "Drama", "Sci-Fi")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Rush",
                    2013,
                    8.3,
                    R.drawable.a10,
                    "Animation", "Comedy", "Family")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Drag Me to Hell",
                    2009,
                    6.7,
                    R.drawable.a11,
                    "Horror", "Thriller")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Despicable Me 2",
                    2013,
                    7.6,
                    R.drawable.a12,
                    "Animation", "Comedy", "Family")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Kill Bill: Vol. 1",
                    2003,
                    8.2,
                    R.drawable.a13,
                    "Action", "Crime")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "A Bug's Life",
                    1998,
                    7.2,
                    R.drawable.a14,
                    "Animation", "Adventure", "Comedy")
            );

            movies.add(new Movie("https://www.youtube.com/watch?v=3sHMCRaS3ao",
                    "Life of Brian",
                    1972,
                    8.9,
                    R.drawable.a15,
                    "Comedy")
            );
        }


        return movies;
    }
}
