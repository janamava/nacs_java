package javaWeek_10.exercise5.logic;

import fileReader.FileReader;
import javaWeek_10.exercise5.model.Genre;
import javaWeek_10.exercise5.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieGenerator {

    public List<Movie> generateMovies() {
        return new FileReader().asStream("javaWeek_10/exercise5/data/movies.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Movie(e[8], cleanJenre(e[1]), e[5], e[6]))
                .collect(Collectors.toList());
    }


    public List<Genre> cleanJenre(String line) {
        List<Genre> genres = new ArrayList<>();
        if (line.length() < 3) {
            return genres;
        }
        return Stream.of(line.split("},"))
                .map(e -> e.replaceAll("]", ""))
                .map(e -> e.replaceAll("\\[", ""))
                .map(e -> e.replaceAll("\\{", ""))
                .map(e -> e.replaceAll("}", ""))
                .map(e -> e.replaceAll("\"", ""))
                .map(e -> e.replaceAll("id:", ""))
                .map(e -> e.replaceAll("name:", ""))
                .map(e -> e.split(","))
                .map(strings -> new Genre(Integer.valueOf(strings[0].trim()), strings[1].trim()))
                .collect(Collectors.toList());

    }
}


//            List<String> splitted1 = Arrays.asList(line.split(","));
//            line = splitted1.get(1);
//            List<String> splitted2 = Arrays.asList(line.split(":"));
//            line = splitted2.get(1);
//            genre = line.replaceAll("\"", "");
//            genre = genre.replaceAll("]", "");
//            genre = genre.replaceAll("}", "");
// peek

