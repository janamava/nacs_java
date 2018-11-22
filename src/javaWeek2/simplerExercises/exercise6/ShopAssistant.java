package javaWeek2.simplerExercises.exercise6;

import javaWeek2.simplerExercises.exercise3.Tool;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {

    public Toolbox findToolBox(List<String> toolNames) {

        Toolbox toolbox = new Toolbox("red");

        for (String toolName: toolNames) {
            Tool tool = new Tool(toolName);
            toolbox.add(tool);
        }

        return toolbox;
    }
}

/*
A ShopAssistant has no attributes.
It has the findToolbox method that receives a list of String representing the names of the tools
the customer asks for and returns a Toolbox.
In order to create a Toolbox it creates one tool per tool requested
adding them to the Toolbox then it returns it.
*/