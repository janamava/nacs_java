package javaWeek_4.exercise8;

public class Box {

    private String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "content=" + content;
    }
}
