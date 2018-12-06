package javaWeek_5.exercise1;

public class CircleApplication {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Class: " + circle.getName());

        Shape shape = circle;
        System.out.println("Shape: " + shape.getName());

        Shape anotherShape = new Circle();
        System.out.println("Another shape: " + anotherShape.getName());

    }

}

/*
Create a Circle and display its name.
In a new line, assign the circle variable to a Shape variable called shape. Just use the = symbol.
Display the shape’s name.
Create another Circle, but this time assign it directly to a Shape with the name anotherShape.
Display anotherShape’s name.
Create the CircleTest class that tests that the Circle is working correctly as both Circle and Shape.


Class: circle
Shape: circle
Another shape: circle

 */
