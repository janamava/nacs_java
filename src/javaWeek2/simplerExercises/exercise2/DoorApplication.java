package javaWeek2.simplerExercises.exercise2;

public class DoorApplication {

    public static void main(String[] args) {
        Door door = new Door(5);
        Key key = new Key();
        key.open(door);
    }
}

/*
In the DoorApplication class main method, create a Door and a Key, and open the door with the key.
 */