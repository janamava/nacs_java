package javaWeek_9.exercise5;

import fileReader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    private FileReader reader = new FileReader();

    public List<Film> getFilms(){
        return reader.asStream("files/films.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Film(e[8], Double.valueOf(e[9]), Long.valueOf(e[10]),
                        Integer.valueOf(e[6]), Long.valueOf(e[0]), Long.valueOf(e[5])))
                .collect(Collectors.toList());
    }
}
