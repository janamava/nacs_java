package javaWeek_4.exercise11;

import javaWeek_4.exercise9.FileReader;

import java.util.*;

public class HappinessApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("files/world-happiness-2017.csv");

        List<HappinessRecord> happinessRecords = fromLinesToHappinessRecords(lines);

        Collections.sort(happinessRecords, Comparator.comparing(HappinessRecord::getRank));

        for (int times = 0; times < 5; times++) {
            System.out.println(happinessRecords.get(times));
        }


    }

    public static List<HappinessRecord> fromLinesToHappinessRecords(List<String> lines) {
        List<HappinessRecord> records = new ArrayList<>();
        for (String line : lines) {
            HappinessRecord record = fromLineToHappinessRecord(line) ;
            records.add(record);
        }
        return records;
    }

    public static HappinessRecord fromLineToHappinessRecord(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String country = columns.get(0);
        Integer rank = Integer.valueOf(columns.get(1));
        Double score = Double.valueOf(columns.get(2));
        return new HappinessRecord(country,rank,score);
    }


}
/*
Create the HappinessApplication class
 that has a main method that uses the FileReader to read the world-happiness-2017.csv,

 transforms its list of lines into a list of HappinessRecord,
 sorts it by rank and displays the first five.


Rank: 1 | Country: Norway | Score: 7.53700017929077
Rank: 2 | Country: Denmark | Score: 7.52199983596802
Rank: 3 | Country: Iceland | Score: 7.50400018692017
Rank: 4 | Country: Switzerland | Score: 7.49399995803833
Rank: 5 | Country: Finland | Score: 7.4689998626709
 */