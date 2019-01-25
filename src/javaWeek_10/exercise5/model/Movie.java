package javaWeek_10.exercise5.model;

import java.util.List;

public class Movie {

    private String name;
    private List<Genre> genre;
    private String revenue;
    private String runtime;

    public Movie(String name, List<Genre> genre, String revenue, String runtime) {
        this.name = name;
        this.genre = genre;
        this.revenue = revenue;
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public String getRevenue() {
        return revenue;
    }

    public String getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return "name: " + name + ", genre: " + genre +
                ", revenue: " + revenue + ", runtime" + runtime;
    }
}
