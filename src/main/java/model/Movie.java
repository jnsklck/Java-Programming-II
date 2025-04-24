package model;

import java.util.Objects;

public class Movie implements Comparable<Movie> {

    private final String title;
    private final String publishingYear;
    private final double rating;

    public Movie(String title, String publishingYear, double averageRating) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.rating = averageRating;
    }

    public String title() {
        return title;
    }

    public String publishingYear() {
        return publishingYear;
    }

    public double rating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", publishingYear=" + publishingYear + ", rating=" + rating
                + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, publishingYear, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Movie other = (Movie) obj;
        return Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
                && Objects.equals(publishingYear, other.publishingYear)
                && Objects.equals(title, other.title);
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return title.compareTo(otherMovie.title);
    }

}
