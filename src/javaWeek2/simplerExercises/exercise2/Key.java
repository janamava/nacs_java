package javaWeek2.simplerExercises.exercise2;

public class Key {

    void open(Door door) {
        Integer number = door.getNumber();
        System.out.println("I'm opening the door number " + number);
    }
}

/*
The Key has no attributes. It has the open method that receives a door and says
 that it’s opening the door with its door number.
 */