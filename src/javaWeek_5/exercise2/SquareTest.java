package javaWeek_5.exercise2;

import javaWeek_5.exercise1.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square = new Square();
    private Shape squareShape = new Square();

    @Test
    void getSquareName() {
        String displayed = square.getName();
        Assertions.assertEquals("square", displayed);
    }

    @Test
    void getShapeName() {
        String displayed = this.squareShape.getName();
        Assertions.assertEquals("square", displayed);
    }
}