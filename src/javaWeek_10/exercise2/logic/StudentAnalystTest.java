package javaWeek_10.exercise2.logic;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class StudentAnalystTest {

    private StudentAnalyst studentAnalyst = new StudentAnalyst();

    @Test
    void getEducationLevelsNumber() {
        Map<String, Long> educationLevelsNumber = studentAnalyst.getEducationLevelsNumber();


    }

    @Test
    void getSortedByDegrees() {
    }

    @Test
    void getHighestDegreeScoreLessThen60() {
    }

    @Test
    void getAverageHighScoreThreeStudents() {
        List<String> averageHighScoreThreeStudents = studentAnalyst.getAverageHighScoreThreeStudents();
        System.out.println(averageHighScoreThreeStudents);
    }


    @Test
    void isHighSchoolAtLeast95() {
        boolean highSchoolAtLeast95 = studentAnalyst.isHighSchoolAtLeast95();
        System.out.println(highSchoolAtLeast95);
    }
}