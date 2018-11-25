package javaWeek_2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {

    public List<HikingBoot> getHikingBootRecommendations() {
        List<HikingBoot> recommendations = new ArrayList<>();
        recommendations.add(new HikingBoot(40));
        recommendations.add(new HikingBoot(41));
        recommendations.add(new HikingBoot(42));
        Collections.shuffle(recommendations);
        return recommendations;
    }
}

/*
Define the BootShopAssistant agent class that has a getHikingBootRecommendations method
that returns a list of three different hiking boots with sizes 40, 41 and 42 in random order.

Use the Collections.shuffle method to randomize the order of the elements in a list.

 */