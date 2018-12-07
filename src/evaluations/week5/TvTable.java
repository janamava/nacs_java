package evaluations.week5;

import javaWeek_5.exercise6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {

    private List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "TvTable{" +
                "parts=" + parts +
                '}';
    }

    public List<String> getParts() {
        return parts;
    }
}
