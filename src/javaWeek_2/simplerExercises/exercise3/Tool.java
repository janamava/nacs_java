package javaWeek_2.simplerExercises.exercise3;

public class Tool {

    private String name;

    public Tool(String name) { //don't forget a constructor if you are going to create a tool somewhere else
        this.name = name;
    }

    public String getName() { // getter that gets the value of the input
        return name;
    }
}

/*
A Tool has a name. It also has a getName method.
*/