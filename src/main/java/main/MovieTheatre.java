package main;

import model.Movie;
import model.MovieByRatingDescendingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * MovieTheatre
 *
 * {@code @Author} Jonas
 * {@version} 1.0
 */
public class MovieTheatre {

    public static void main(String[] args) {

        /**
         * Initialize List
         */
        List<Movie> movies = new ArrayList<>();

        /**
         * Fill List with Movies
         */
        movies.add(new Movie("The Godfather", "1972", 9.2));
        movies.add(new Movie("John Wick", "2023", 8.4));
        movies.add(new Movie("Disaster Movie", "2008", 2.1));
        movies.add(new Movie("The Matrix", "1999", 7.8));
        movies.add(new Movie("The Shawshank Redemption", "1994", 9.2));

        /**
         * Sort List by title using the compareTo method implemented in the class Movie (implemented with sorting by title, therefore sorting by title here)
         */
        System.out.println("Sorted by title:");
        Collections.sort(movies);
        System.out.println(movies);

        System.out.println("=========================");

        /**
         * Sort List by descending rating using custom Comparator MovieByRatingDescendingComparator (sorts movies using rating)
         */
        System.out.println("Sorted by descending rating:");
        Collections.sort(movies, new MovieByRatingDescendingComparator());
        System.out.println(movies);


    }
}
