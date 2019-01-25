package javaWeek_10.exercise5.logic;

import javaWeek_10.exercise5.model.Genre;
import javaWeek_10.exercise5.model.Movie;

import java.util.List;

public class MovieAnalyst {

    private List<Movie> movies = new MovieGenerator().generateMovies();

    public void print() {
        movies.stream()
                .flatMap(movie -> movie.getGenre().stream())
                .map(Genre::getName)
                .distinct()
                .forEach(System.out::println);

    }

    public Long getUnique() {
        return movies.stream()
                .filter(e -> !e.getGenre().isEmpty())
                .map(Movie::getGenre)
                .distinct()
                .count();
    }
}
