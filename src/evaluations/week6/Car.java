package evaluations.week6;

public abstract class Car {

    private String type;
    private String brand;


    public Car(String brand) {
        this.type = type;
        this.brand = brand;

    }

    public abstract String getType();

    public String getBrand() {
        return brand;
    }

    public void drive(){
        System.out.println("I love this " + getType() + " " + brand);
    }
}
