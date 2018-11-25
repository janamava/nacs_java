package javaWeek_2.simplerExercises.exercise1;

import javaWeek_2.simplerExercises.exercise5.Magazine;

import java.util.List;

public class Printer {                       // here we are creating a blueprint of any printer in the world

    public void print(Article article) {            // in order to print, Printer needs an article, therefore we are
                                             // putting Article article in parentheses.
        String title = article.getTitle();   // here we getTitle value from Class Article
        String text = article.getText();     // here we getText value from Class Article
        System.out.println(title + " \n\n" + text);
    }

    public void printMagazine(Magazine magazine) {
        System.out.println(magazine.getTitle() + "\n");

        List<Article> articles = magazine.getArticles();

        for (Article article : articles) {
            System.out.println(article.getTitle());
            System.out.println(article.getText() + " \n");
        }
    }
}

/*
A Printer can print an article, which means it just writes the title and the text on the screen.

exercise 5
Reuse the Printer from exercise 1 (don’t copy it, reuse the existing one from the package where it already is).
Add the new method printMagazine to the Printer that receives a Magazine
and displays its title and then all the articles.
 */