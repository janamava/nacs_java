package javaWeek_4.exercise7;

public class Topic {

    private String text;

    public Topic(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "text=" + text;
    }
}
