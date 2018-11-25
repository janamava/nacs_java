package javaWeek_2.exercise4;

public class Meal {

    private String name;
    private Double price;

    public Meal(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
/*
The Meal has a name and a price. The price is a decimal number.
 */