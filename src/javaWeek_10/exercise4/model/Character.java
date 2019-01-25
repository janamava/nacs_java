package javaWeek_10.exercise4.model;

public class Character {

    private String name;
    private String deathYear;
    private String gender;
    private String deathBook;
    private String allegiance;
    private String nobility;
    private String bookIntroChapter;
    private String deathChapter;

    public Character(String name, String deathYear, String gender, String deathBook,
                     String allegiance, String nobility, String bookIntroChapter, String deathChapter) {
        this.name = name;
        this.deathYear = deathYear;
        this.gender = gender;
        this.deathBook = deathBook;
        this.allegiance = allegiance;
        this.nobility = nobility;
        this.bookIntroChapter = bookIntroChapter;
        this.deathChapter = deathChapter;
    }

    public String getName() {
        return name;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getGender() {
        return gender;
    }

    public String getDeathBook() {
        return deathBook;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public String getNobility() {
        return nobility;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    @Override
    public String toString() {
        return name;
    }
}
