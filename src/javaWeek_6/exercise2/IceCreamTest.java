package javaWeek_6.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {


    @Test
    void testConeIceCream() {
        IceCream cone = new ConeIceCream("Strawberry", "Sprinkles");
        String displayed = cone.eat();
        Assertions.assertEquals("The Strawberry ice-cream with Sprinkles is licked.", displayed);
    }

    @Test
    void testCupIceCream() {
        IceCream cup = new CupIceCream("Hokey-Pokey", "Cookies");
        String displayed = cup.eat();
        Assertions.assertEquals("The Hokey-Pokey ice-cream with Cookies is eaten with a spoon.", displayed);
    }
}
