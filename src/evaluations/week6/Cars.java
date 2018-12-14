package evaluations.week6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {

    public static Car getNextCar(String brand){
        Integer randomPosition = new Random().nextInt(2);
        List<Car> cars = Arrays.asList(new ManualCar(brand), new AutomaticCar(brand));
        Car car = cars.get(randomPosition);
        return car;

    }
}
