package javaWeek_2.exercise3;

import java.util.ArrayList;
import java.util.List;

/*public class BootShopAssistant {

    public List<String> getHikingBootRecommendations(){

        List<Integer> hikingBoots = makeHikingBootRecommendations();

        return hikingBoots.shuffle();
    }

    public List<Integer> makeHikingBootRecommendations() {
        List<Integer> hikingBoots = new ArrayList<>();
        Integer boot1 = 40;
        hikingBoots.add(boot1);
        Integer boot2 = 41;
        hikingBoots.add(boot2);
        Integer boot3 = 42;
        hikingBoots.add(boot3);
        return hikingBoots;
    }

}

/*
Define the BootShopAssistant agent class that has a getHikingBootRecommendations method
that returns a list of three different hiking boots with sizes 40, 41 and 42 in random order.

Use the Collections.shuffle method to randomize the order of the elements in a list.

 */