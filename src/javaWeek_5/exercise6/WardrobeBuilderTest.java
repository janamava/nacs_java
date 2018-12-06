package javaWeek_5.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeBuilderTest {

    private WardrobeBuilder builder = new WardrobeBuilder();

    private List<String> expectedParts = Arrays.asList("bottom", "side", "side", "back", "top", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "door", "door");

    @Test
    void build() {
        Wardrobe wardrobe = builder.build();
        List<String> parts = wardrobe.getParts();
        Assertions.assertLinesMatch(expectedParts, parts);
    }

    @Test
    void checkSize(){
        Wardrobe wardrobe = builder.build();
        List<String> parts = wardrobe.getParts();
        Assertions.assertEquals(expectedParts.size(), parts.size());
    }
}

/*
Create the WardrobeBuilderTest class to make sure the build method returns a proper wardrobe.
For this you will need the getParts method in the Wardrobe class.
Hints:
In order to create a meaningful test, create a list of string manually with exactly the right parts in the right order.
Then you can test that both lists have the same size and that they are exactly the same.

A more dynamic way to do it would be to place the parts of the wardrobe in a map,
counting how many of each are there, and then you check that it is indeed the right amount for each part.

 */