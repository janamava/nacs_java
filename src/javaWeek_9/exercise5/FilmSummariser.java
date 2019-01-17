package javaWeek_9.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummariser {

    private List<Film> films = new FilmReader().getFilms();

    public List<Film> getHighestRating(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getHighestRatingMoreThen3Hours(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .filter(e -> e.getRuntime() > 180)
                .limit(3)
                .collect(Collectors.toList());

    }

    public List<Film> get4MostExpensive(){
        return films.stream()
                .sorted((e1, e2) -> e2.getBudget().compareTo(e1.getBudget()))
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> get4MostExpensiveShorterThen90(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(e -> e.getRuntime() < 90)
                .limit(4)
                .collect(Collectors.toList());

    }

    public List<Film> getCondition5(){
        return films.stream()
                .filter(e -> e.getScore() > 7.0)
                .filter(e -> e.getBudget() > 50000 && e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> condition6(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getRuntime))
                .sorted(Comparator.comparing(Film::getVoteCount).reversed())
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> condition7(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getVoteCount).reversed())
                .filter(e -> e.getScore() > 8)
                .sorted(Comparator.comparing(Film::getRevenue).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
}
