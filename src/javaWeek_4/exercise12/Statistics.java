package javaWeek_4.exercise12;

import java.util.List;

public class Statistics {

    private Integer totalCharacters;
    private Integer totalDeadCharacters;
    private Integer totalDeadMenPercentage;
    private Integer totalDeadWomenPercentage;
    private String bookWithMostDeaths;
    private Integer totalDeathsInThatBook;
    private List<Character> deadCharactersInThatBook;

    public Integer getTotalCharacters() {
        return totalCharacters;
    }

    public void setTotalCharacters(Integer totalCharacters) {
        this.totalCharacters = totalCharacters;
    }

    public Integer getTotalDeadCharacters() {
        return totalDeadCharacters;
    }

    public void setTotalDeadCharacters(Integer totalDeadCharacters) {
        this.totalDeadCharacters = totalDeadCharacters;
    }

    public Integer getTotalDeadMenPercentage() {
        return totalDeadMenPercentage;
    }

    public void setTotalDeadMenPercentage(Integer totalDeadMenPercentage) {
        this.totalDeadMenPercentage = totalDeadMenPercentage;
    }

    public Integer getTotalDeadWomenPercentage() {
        return totalDeadWomenPercentage;
    }

    public void setTotalDeadWomenPercentage(Integer totalDeadWomenPercentage) {
        this.totalDeadWomenPercentage = totalDeadWomenPercentage;
    }

    public String getBookWithMostDeaths() {
        return bookWithMostDeaths;
    }

    public void setBookWithMostDeaths(String bookWithMostDeaths) {
        this.bookWithMostDeaths = bookWithMostDeaths;
    }

    public Integer getTotalDeathsInThatBook() {
        return totalDeathsInThatBook;
    }

    public void setTotalDeathsInThatBook(Integer totalDeathsInThatBook) {
        this.totalDeathsInThatBook = totalDeathsInThatBook;
    }

    public List<Character> getDeadCharactersInThatBook() {
        return deadCharactersInThatBook;
    }

    public void setDeadCharactersInThatBook(List<Character> deadCharactersInThatBook) {
        this.deadCharactersInThatBook = deadCharactersInThatBook;
    }
}
