package javaWeek2.simplerExercises.exercise5;

import javaWeek2.simplerExercises.exercise1.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String title;
    public List<Article> magazin = new ArrayList<>();

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void add(Article article) {
        magazin.add(article);
    }

    public List<Article> getArticles() {
        return magazin;
    }
}
/*
A Magazine has a title and a list of Article.
Its constructor only asks for the title.
Make sure its articles are initialized with an empty collection.

It also has the method add to add an Article to its list

and the method getArticles that returns the list.

 */