package javaWeek_4.exercise8;

import java.util.Optional;

public class AdvancedGiftApplication {

    public static void main(String[] args) {

        Optional<Box> giftbox = Optional.empty();
        System.out.println("Gift: " + giftbox);

        Box present = new Box("Robotoy");

        giftbox = Optional.of(present);
        System.out.println("Gift: " + giftbox);

        if (giftbox.isPresent()) {
            System.out.println("There is a present in the gift box");
        }
        else {
            System.out.println("There is no present");
        }

        Box valueOfBox = giftbox.get();
        System.out.println("The gift is a " + valueOfBox.toString());

    }
}
/*
Create the AdvancedGiftApplication class and write the following instructions in its main method:
Create the Box class that has a String called content.
Create an empty giftBox Optional of Box and display it.
Create a Box with a present name as content.
Assign an Optional of Box to the giftBox containing the previous Box and display it.
Ask if the giftBox is present and display the answer.
Get the value contained in giftBox and display it. To display the Box class create the toString method.
Hints:
Use Intellij shortcuts to create the toString and equals methods.


Gift: Optional.empty
Gift: Optional[content=Robotoy]
There is a present in the gift box
The gift is a content=Robotoy

*/