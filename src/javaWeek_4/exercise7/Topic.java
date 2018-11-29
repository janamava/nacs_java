package javaWeek_4.exercise7;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(text, topic.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
