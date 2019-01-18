package evaluations.week9;


import fileReader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class Surveyer {

    public static void main(String[] args) {

        List<Student> students = new FileReader().asStream("files/students-performance.csv")
                .map(e -> e.split(";"))
                .map(e -> new Student(e[0], e[1], Integer.valueOf(e[2]), Integer.valueOf(e[3]), Integer.valueOf(e[4])))
                .collect(Collectors.toList());

        long totalNumber = students.stream()
                .count();
        System.out.println("Total number of student performance entries: " + totalNumber);


        long maleStudents = students.stream()
                .filter(e -> e.getGender().contains("male"))
                .count();
        System.out.println("Number of male students:" + maleStudents);


        long femaleStudents = students.stream()
                .filter(e -> e.getGender().contains("male"))
                .count();
        System.out.println("Number of female students:" + femaleStudents);


        long uniqueEducation = students.stream()
                .map(e -> e.getEducation())
                .distinct()
                .count();
        System.out.println("Parental education levels" + uniqueEducation);

        long scoredHigherThen90AllSubjects = students.stream()
                .filter(e -> e.getMathScore() > 90)
                .filter(e -> e.getReadingScore() > 90)
                .filter(e -> e.getWritingScore() > 90)
                .count();

        System.out.println("Number of students with scores higher than 90: " + scoredHigherThen90AllSubjects);

        long exactly100AllSubjects = students.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .filter(e -> e.getWritingScore() == 100)
                .count();

        System.out.println("Number of students with scores equal to 100: " + exactly100AllSubjects);


    }


}
