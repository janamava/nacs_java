package javaWeek_10.exercise2.logic;

import javaWeek_10.exercise2.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentAnalyst {

    private List<Student> students = new StudentsGenerator().getStudents();

    public Map<String, Long> getEducationLevelsNumber() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getDegree, Collectors.counting()));

    }

    public List<String> getSortedByDegrees() {
        return getEducationLevelsNumber().entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
    }

    public long getHighestDegreeScoreLessThen60() {
        return students.stream()
                .filter(e -> e.getDegree().equals("master's degree"))
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .count();
    }

    public List<String> getAverageHighScoreThreeStudents() {
        return students.stream()
                .map(e -> getAverageScore(e) + " | " + e.getGender() )
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }

    public int getAverageScore(Student e) {
        return (e.getMathScore() + e.getReadingScore() + e.getWritingScore())/ 3;
    }

    public boolean isHighSchoolAtLeast95() {
        return students.stream()
                .filter(e -> e.getDegree().equals("some high school"))
                .anyMatch(e -> e.getWritingScore() >= 95 && (e.getReadingScore() >= 95 && e.getMathScore() >= 95));
    }

}
/*


Parent education level appearances:
{high school=196, master's degree=59, some college=226, bachelor's degree=118, some high school=179, associate's degree=222}

Parent education level appearances sorted top bottom:
some college | 226
associate's degree | 222
high school | 196
some high school | 179
bachelor's degree | 118
master's degree | 59highestDegreeScoreLessThen60

Number of students with high parent education and lower scores than 60: 7

Genders and average scores of the top four average score students:
99 | female
99 | female
99 | female
98 | male

Is there any student with a parent education level of some high school that has at least 97 in every topic?
true

 */