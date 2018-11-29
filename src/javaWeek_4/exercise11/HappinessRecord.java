package javaWeek_4.exercise11;

public class HappinessRecord {

    private String country;
    private Integer rank;
    private Double score;

    public HappinessRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public Integer getRank() {
        return rank;
    }

    public String getCountry() {
        return country;
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "rank=" + rank +
                " | country=" + country +
                " | score=" + score;
    }
}

/*
Create the HappinessRecord class that has a String country, an Integer rank and a Double score.
 */
