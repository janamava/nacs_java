package javaWeek_5.exercise3;

import javaWeek_5.exercise1.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicColourApplication {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Colour: " + rectangle.getColour());

        System.out.println("Name: " + rectangle.getName());

        Coloured coloured = (Coloured) rectangle; // this is casting. Now rectangle is no longer rectangle, but the Coloured object.
        System.out.println("Coloured: " + coloured.getColour());

        Shape shape = (Shape) rectangle; //casting. Rectangle now is the Shape object.
        System.out.println("Shape: " + shape.getName());

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle);
        System.out.println(rectangles);

        List<Coloured> coloreds = new ArrayList<>();
        coloreds.add(rectangle);
        coloreds.add(coloured);
        System.out.println(coloreds);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(shape);
        System.out.println(shapes);
    }
}
/*


Create a list of Shape called shapes and add rectangle and shape to it. Note that you cannot add colored because it’s not a Shape object.
Add the toString method to the Rectangle. Make sure you use its interface methods to return its color and name as a String. Display the three lists


Color: violet
Name: rectangle
Colored: violet
Shape: rectangle
[violet rectangle]
[violet rectangle, violet rectangle]
[violet rectangle, violet rectangle]

 */