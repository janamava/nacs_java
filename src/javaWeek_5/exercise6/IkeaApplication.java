package javaWeek_5.exercise6;

public class IkeaApplication {

    public static void main(String[] args) {

        WardrobeBuilder builder = new WardrobeBuilder();
        Wardrobe wardrobe = builder.build();
        System.out.println(wardrobe);

    }
}
/*
Create the IkeaApplication class and write the following instructions in its main method:
Create a WardrobeBuilder and build one Wardrobe.
Display the wardrobe. It should have all the right parts.
Create the WardrobeBuilderTest class to make sure the build method returns a proper wardrobe. For this you will need the getParts method in the Wardrobe class.

 */