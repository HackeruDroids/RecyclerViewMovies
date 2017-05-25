package hackeru.edu.recyclerviewmovies;

import java.util.Arrays;

/**
 * Created by hackeru on 25/05/2017.
 */

public class Movie {
    private final String title;
    private final String[] genres;
    private final int year;
    private double rating; //8.4
    private final String youTubeUrl;
    private final int thumbnailResId;//R.drawable.a1

    //Constructor: alt + insert (cmd + n)
    public Movie(String youTubeUrl, String title, int year, double rating, int thumbnailResId, String... genres) {
        this.title = title;
        this.thumbnailResId = thumbnailResId;
        this.genres = genres;
        this.year = year;
        this.rating = rating;
        this.youTubeUrl = youTubeUrl;
    }

    //Setter:
    public void setRating(double rating) {
        this.rating = rating;
    }

    //Getters:
    public String getTitle() {
        return title;
    }

    public int getThumbnailResId() {
        return thumbnailResId;
    }

    public String[] getGenres() {
        return genres;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String getYouTubeUrl() {
        return youTubeUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genres=" + Arrays.toString(genres) +
                ", year=" + year +
                ", rating=" + rating +
                ", youTubeUrl='" + youTubeUrl + '\'' +
                '}';
    }
}
