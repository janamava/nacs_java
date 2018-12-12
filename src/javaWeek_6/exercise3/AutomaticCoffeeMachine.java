package javaWeek_6.exercise3;

public class AutomaticCoffeeMachine extends CoffeeMaker {

    @Override
    public String getName() {
        return "Automatic coffee machine";
    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }
}
