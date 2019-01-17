package javaWeek_9.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummariser {

    private List<Film> films = new FilmReader().getFilms();


    //three films with the highest rating, sorted by rating
    public List<Film> getCondition1() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    //three films with the highest rating that are longer than three hours, sorted by rating
    public List<Film> getCondition2() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .filter(e -> e.getRuntime() > 180)
                .limit(3)
                .collect(Collectors.toList());

    }
    // four most expensive films, sorted by budget
    public List<Film> getCondition3() {
        return films.stream()
                .sorted((e1, e2) -> e2.getBudget().compareTo(e1.getBudget()))
                .limit(4)
                .collect(Collectors.toList());
    }
    // four most expensive films that are shorter than one hour and a half, sorted by budget
    public List<Film> getCondition4() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(e -> e.getRuntime() < 90)
                .limit(4)
                .collect(Collectors.toList());

    }
    // four most rated films with a rating higher than 7 and a budget between 50.000 and 500.000 dollars,
    // sorted by budget
    public List<Film> getCondition5() {
        return films.stream()
                .filter(e -> e.getScore() > 7.0)
                .filter(e -> e.getBudget() > 50000 && e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }
    // three shortest movies, that have most votes and highest score
    public List<Film> getCondition6() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getRuntime))
                .sorted(Comparator.comparing(Film::getVoteCount).reversed())
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // ten most voted movies with the score more then 8, sorted by highest revenue
    public List<Film> getCondition7() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getVoteCount).reversed())
                .filter(e -> e.getScore() > 8)
                .sorted(Comparator.comparing(Film::getRevenue).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
}
