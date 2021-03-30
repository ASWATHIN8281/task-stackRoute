package com.stackroute.collections;
import java.time.LocalDate;

/*
Movie class has four fields- movieId,movieName, genre and releaseDate
This class should be of Comparable type comparing movies based on releaseDate
 */
public class Movie implements Comparable<Movie>{
    private int movieId;
    private String movieName;
    private String genre;
    private  LocalDate releaseDate;

    public Movie(int movieId, String movieName, String genre, LocalDate releaseDate) {
        this.movieId=movieId;
        this.movieName=movieName;
        this.genre=genre;
        this.releaseDate=releaseDate;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return String.format("movieId="+movieId+", movieName="+movieName+", genre="+genre+", releaseDate="+releaseDate.toString());
    }

    @Override
    public int compareTo(Movie movie) {
        return this.releaseDate.compareTo(movie.getReleaseDate());
    }
}
