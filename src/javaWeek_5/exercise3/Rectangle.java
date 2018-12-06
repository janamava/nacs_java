package javaWeek_5.exercise3;

import javaWeek_5.exercise1.Shape;

public class Rectangle implements Coloured, Shape {

    @Override
    public String getColour() {
        return "green";
    }

    @Override
    public String getName() {
        return "rectangle";

    }

    @Override
    public String toString() {
        return getColour() + " " + getName();
    }
}
