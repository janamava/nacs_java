package javaWeek_9.exercise4;

import fileReader.FileReader;

import java.util.Comparator;


public class HappinessApplication {

    public static void main(String[] args) {

        new FileReader().asStream("files/world-happiness-2017.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new HappinessRecord(e[0], Integer.valueOf(e[1]), Double.valueOf(e[2])))//to access elements in arrays
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .map(e -> "Rank: " + e.getRank() + " | Country: " + e.getCountry() + " | Score: " + e.getScore())
                .forEach(e -> System.out.println(e));


    }
}
//.map(e -> Arrays.asList(e))
//.map(e -> new HappinessRecord(e.get(0), Integer.valueOf(e.get(1)), Double.valueOf(e.get(2))))
// .sorted(Comparator.comparing(e -> e.getRank()))