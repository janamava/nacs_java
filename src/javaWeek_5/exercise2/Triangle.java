package javaWeek_5.exercise2;

import javaWeek_5.exercise1.Shape;

public class Triangle implements Shape {

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
