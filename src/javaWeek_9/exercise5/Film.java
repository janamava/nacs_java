package javaWeek_9.exercise5;

public class Film {

    private String title;
    private Double score;
    private Long voteCount;
    private Integer runtime;
    private Long budget;
    private Long revenue;

    public Film(String title, Double score, Long voteCount, Integer runtime, Long budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return title;
    }
}
