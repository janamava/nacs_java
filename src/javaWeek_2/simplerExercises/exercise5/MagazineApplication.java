package javaWeek_2.simplerExercises.exercise5;

import javaWeek_2.simplerExercises.exercise1.Printer;

public class MagazineApplication {

    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazin();
        Printer printer = new Printer();
        printer.printMagazine(magazine);
    }
}
/*
In the MagazineApplication class main method,
create an Editor, use it to write a Magazine,
create a Printer and use it to print a preview of the Magazine.

 */