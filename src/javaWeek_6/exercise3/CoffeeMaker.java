package javaWeek_6.exercise3;

public abstract class CoffeeMaker {

    public abstract String getName();
    public abstract Integer getBrewingTime();

    public Coffee brew(){
        return new Coffee(getName(), getBrewingTime());
    }
}
