package evaluations.week9;

public class Student {

    private String gender;
    private String education;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;

    public Student(String gender, String education, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.education = education;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
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
