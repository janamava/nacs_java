package javaWeek2.simplerExercises.exercise6;

import javaWeek2.simplerExercises.exercise3.Tool;

import java.util.Arrays;
import java.util.List;

public class ToolShopApplication {

    public static void main(String[] args) {

        List<String> toolList = Arrays.asList("ruler", "pliers", "wrench");

        ShopAssistant shopAssistant = new ShopAssistant();
        Toolbox toolBox = shopAssistant.findToolBox(toolList);
        System.out.println(toolBox.getColor() + " toolbox:");
        for (Tool tool : toolBox.getTools()) {
            System.out.println(tool.getName());

        }
    }
}
/*
In the ToolShopApplication class main method,
create a list of String with three tool names inside,
create a ShopAssistant and use it to find a red Toolbox with those three tools inside.
*/