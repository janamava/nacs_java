package javaWeek_4.exercise4;

import java.util.Optional;

public class BasicGiftApplication {

    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);

        giftBox = Optional.of("Robotoy");
        System.out.println("Gift: " + giftBox);

        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box.");
        } else {
            System.out.println("There is no present in the gift box.");
        }

        String value = giftBox.get();
        System.out.println("The gift is a " + value);


    }
}

/*
Create the BasicGiftApplication class and write the following instructions in its main method:
Create an empty giftBox Optional of String and display it.
Assign an Optional of String to the giftBox containing an actual present and display it.
Ask if the giftBox is present and display the answer.
Get the value contained in giftBox and display it.


Gift: Optional.empty
Gift: Optional[Robotoy]
There is a present in the gift box
The gift is a Robotoy

 */