package javaWeek_10.exercise2.model;

public class Student {

    private String gender;
    private String degree;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;

    public Student(String gender, String degree, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.degree = degree;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getDegree() {
        return degree;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }
}
