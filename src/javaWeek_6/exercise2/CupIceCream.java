package javaWeek_6.exercise2;

public class CupIceCream extends IceCream{

    public CupIceCream(String flavour, String topping) {
        super(flavour, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavour() + " ice-cream with " + getTopping() +  " is eaten with a spoon.";
    }
}
