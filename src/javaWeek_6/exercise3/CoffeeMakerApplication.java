package javaWeek_6.exercise3;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {

    public static void main(String[] args) {
        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");

        }

        Optional<CoffeeMaker> automatic = CoffeeMakers.get("Automatic coffee machine");
        if (automatic.isPresent()) {
            Coffee coffee = automatic.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
        }

        Optional<CoffeeMaker> frenchPress = CoffeeMakers.get("French press");
        if (frenchPress.isPresent()) {
            Coffee coffee = frenchPress.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
        }


        Optional<CoffeeMaker> autoDrip = CoffeeMakers.get("Auto drip");
        if (autoDrip.isPresent()) {
            Coffee coffee = autoDrip.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
        }

        Optional<CoffeeMaker> mokka = CoffeeMakers.get("Mokka");
        if (!mokka.isPresent()) {
            System.out.println("The coffee maker with the name Mokka is not available");
        }
        else {
            Coffee coffee = mokka.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");

        }

    }

}
