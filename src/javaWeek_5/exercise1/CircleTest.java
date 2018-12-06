package javaWeek_5.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle = new Circle();
    private Shape shape = new Circle();

    @Test
    void getCircleName() {
        String displayed = circle.getName();
        Assertions.assertEquals("circle", displayed);

    }
    @Test
    void getShapeName() {
        String displayed = shape.getName();
        Assertions.assertEquals("circle", displayed);

    }
}