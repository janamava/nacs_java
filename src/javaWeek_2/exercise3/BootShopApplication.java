package javaWeek_2.exercise3;

import java.util.List;

public class BootShopApplication {

    public static void main(String[] args) {
        BootShopAssistant bootShopAssistant = new BootShopAssistant();
        Hansel hansel = new Hansel();
        List<HikingBoot> recommendations = bootShopAssistant.getHikingBootRecommendations();
        hansel.tryHikingBoot(recommendations);

    }
}

/*
Define the BootShopApplication class that has a main method that uses
 the BootShopAssistant and Hansel so that Hansel can find the right hiking boot.
 */