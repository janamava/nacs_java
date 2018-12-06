package javaWeek_5.exercise1;

public class Circle implements Shape {

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
/*
Create the Circle class that implements the Shape interface.
Implement the getName method with the help of Intellij. Return the word circle in that method.

 */