package evaluations.week8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    Predicate<Double> trigger;
    Function<Double, String> display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

    //public Thermostat(Function<Double, String> display) {
      //  this.display = display;
    //}

    public String sense(Double temperature) {
        while (trigger.test(temperature)) {
            return "Warning!";
        }
        return display.apply(temperature);
    }

}
