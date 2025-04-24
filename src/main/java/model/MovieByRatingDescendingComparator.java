package model;

import java.util.Comparator;

public class MovieByRatingDescendingComparator implements Comparator<Movie> {
    /**
     * Sort movies by compare two movies to each other by rating, if they have the same rating, sort them by alphabetical order
     *
     * @param movie1 the first object to be compared.
     * @param movie2 the second object to be compared.
     */
    public int compare(Movie movie1, Movie movie2) {
        if (movie1.rating() == movie2.rating()) {
            return movie1.title().compareTo(movie2.title());
        }
        return Double.compare(movie2.rating(), movie1.rating());
    }
}
