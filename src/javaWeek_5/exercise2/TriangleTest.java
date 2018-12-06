package javaWeek_5.exercise2;

import javaWeek_5.exercise1.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle = new Triangle();
    private Shape triangleShape = new Triangle();

    @Test
    void getTriangleName() {
        String displayed = triangle.getName();
        Assertions.assertEquals("triangle", displayed);
    }

    @Test
    void getShapeName() {
        String displayed = triangleShape.getName();
        Assertions.assertEquals("triangle", displayed);

    }
}