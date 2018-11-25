package javaWeek_2.simplerExercises.exercise1;

public class Article {               //here we are creating a blueprint of an article

    private String title;            //here are the attributes of any paper in the world
    private String text;

    public Article(String title, String text) { //this is a constructor for both. Just check both items at once when creating.
        this.title = title;
        this.text = text;
    }

    public String getTitle() {  // Alt+Insert Getter - gets a value of title
        return title;
    }

    public String getText() {   // Alt+Insert Getter - gets a value of text
        return text;
    }
}


/*
An Article has a title and a text. It also has the methods getTitle and getText.
*/























