package javaWeek_2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Meal> meals;

    public Menu() {
        this.meals = new ArrayList<>();
        Meal couscous = new Meal("Couscous", 8.5);
        Meal tajin = new Meal("Tajin", 9.5);
        Meal hummus = new Meal("Hummus", 8.5);
        Meal falafel = new Meal("Falafel", 4.0);

        meals.add(couscous);
        meals.add(tajin);
        meals.add(hummus);
        meals.add(falafel);
        }

        public List<Meal> getMeals() {
            return meals;
    }

}
/*

There are four meals in the Menu: couscous (8,5 Euro), tajin (9,5 Euro),
 hummus (3,5 Euro) and falafel (4 Euro).
The Menu provides the list of Meals.

 */