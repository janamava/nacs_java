package javaWeek_8.exercise1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {

    public void display(List<String> encrypted){
        Set<String> uniqueTricks = new HashSet<>(encrypted);
        System.out.println("Number of unique tricks: " + uniqueTricks.size());
        System.out.println("Tricks: " + uniqueTricks);
    }
}
