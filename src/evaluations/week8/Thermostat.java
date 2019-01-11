package evaluations.week8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    Predicate<Double> trigger;
    Function<Double, String> display;

    public Thermostat(Predicate<Double> trigger) {
        this.trigger = trigger;
    }

    public Thermostat(Function<Double, String> display) {
        this.display = display;
    }

    public String sense(Double temperature, Predicate<Double> condition) {
        while (!condition.test(temperature)) {
            display(temperature);
        }
        return "Warning!";
    }

}
