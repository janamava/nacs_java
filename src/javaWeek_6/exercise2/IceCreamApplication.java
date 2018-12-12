package javaWeek_6.exercise2;

public class IceCreamApplication {

    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Chocolate", "Oreo");
        String coneMessage = cone.eat();
        System.out.println(coneMessage);
        IceCream cup = new CupIceCream("Vanilla", "Cookies");
        String cupMessage = cup.eat();
        System.out.println(cupMessage);
    }
}
