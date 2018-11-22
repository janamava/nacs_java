package javaWeek2.simplerExercises.exercise1;

public class PrintApplication { // here is the main application that uses both Article and Printer Classes
                                // to print an actual article

    public static void main(String[] args) {

        Printer printer = new Printer(); // we construct an actual printer
        Article article = new Article("Cat Ipsum", "Nap all day cat dog hate mouse eat string barf pillow."); //we construct an actual article
                                                                    // by giving an actual value in parentheses

        printer.print(article); // here we say to actual printer "hey, please print an actual article

    }

}

/*
In the PrintApplication class main method, create an Article and a Printer and print the article with the printer.
 */