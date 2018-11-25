package javaWeek_2.simplerExercises.exercise3;

public class PaintingApplication {

    public static void main(String[] args) {


        Derek derek =  new Derek();
        derek.hangPainting();

        Tool tool = new Tool("hammer");
        derek.setTool(tool);
        derek.hangPainting();
    }
}
/*
In the PaintingApplication class main method, create a Derek object and ask him to hang the painting.
He should say he’s missing the hammer. Later, create a hammer Tool, give it to Derek and ask him again
 to hang the painting. He should say that he can hang the painting.
 */