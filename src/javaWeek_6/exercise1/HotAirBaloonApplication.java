package javaWeek_6.exercise1;

public class HotAirBaloonApplication {

    public static void main(String[] args) {

        System.out.println("smallBaloon --");
        SmallHotAirBaloon smallBaloon = new SmallHotAirBaloon();
        smallBaloon.liftUp();
        smallBaloon.land();

        System.out.println("bigBaloon --");
        BigHotAirBaloon bigBaloon = new BigHotAirBaloon();
        bigBaloon.liftUp();
        bigBaloon.land();

        HotAirBaloon small = smallBaloon;
        HotAirBaloon big = bigBaloon;

        System.out.println("small --");
        small.liftUp();
        small.land();

        System.out.println("big --");
        big.liftUp();
        big.land();
    }
}
