package javaWeek_4.exercise5;

import java.util.Objects;

public class Grocery {

    private String name;

    public Grocery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(name, grocery.name);
    }
}

/*
    public boolean equals(Grocery name) {
    return this.name.equals(name.getName());
    }
*/
