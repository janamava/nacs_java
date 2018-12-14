package evaluations.week6;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    public String getType() {
        return "Automatic";
    }
}
