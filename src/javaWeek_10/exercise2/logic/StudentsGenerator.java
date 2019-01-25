package javaWeek_10.exercise2.logic;

import fileReader.FileReader;
import javaWeek_10.exercise2.model.Student;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentsGenerator {

    private FileReader reader = new FileReader();

    public List<Student> getStudents() {

        return reader.asStream("javaWeek_10/exercise2/data/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToStudent())
                .collect(Collectors.toList());

    }

    private Function<String[], Student> convertToStudent() {
        return e -> new Student(e[0], e[1], Integer.valueOf(e[2]), Integer.valueOf(e[3]), Integer.valueOf(e[4]));
    }
}
