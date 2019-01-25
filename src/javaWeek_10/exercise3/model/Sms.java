package javaWeek_10.exercise3.model;

public class Sms {

    private String name;
    private String body;

    public Sms(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }
}
