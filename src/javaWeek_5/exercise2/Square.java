package javaWeek_5.exercise2;

import javaWeek_5.exercise1.Shape;

public class Square implements Shape {

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
