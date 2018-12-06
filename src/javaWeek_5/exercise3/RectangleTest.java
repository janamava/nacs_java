package javaWeek_5.exercise3;

import javaWeek_5.exercise1.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle = new Rectangle();
    private Coloured colouredRectangle = new Rectangle();
    private Shape shapeRectangle = new Rectangle();

    @Test
    void testAsRectangle() {
        String displayed = rectangle.getName();
        Assertions.assertEquals("rectangle", displayed);
    }

    @Test
    void testAsColored() {
        String displayedColour = colouredRectangle.getColour();
        Assertions.assertEquals("green", displayedColour);
    }

    @Test
    void testAsShape() {
        String displayed = shapeRectangle.getName();
        Assertions.assertEquals("rectangle", displayed);

    }
}