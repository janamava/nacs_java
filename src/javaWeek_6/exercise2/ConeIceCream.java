package javaWeek_6.exercise2;

public class ConeIceCream extends IceCream {

    public ConeIceCream(String flavour, String topping) {
        super(flavour, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavour() + " ice-cream with " + getTopping() +  " is licked.";
    }
}
