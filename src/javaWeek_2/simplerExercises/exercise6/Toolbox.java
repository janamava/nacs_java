package javaWeek_2.simplerExercises.exercise6;

import javaWeek_2.simplerExercises.exercise3.Tool;

import java.util.ArrayList;
import java.util.List;

public class Toolbox {

    private String color;
    public List<Tool> toolbox = new ArrayList<>();

    public Toolbox(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void add(Tool tool) {
        toolbox.add(tool);
    }

    public List<Tool> getTools() {
        return toolbox;
    }
}

/*
A Toolbox has a color and a list of Tool.
Its constructor only asks for the color.
Make sure its tools are initialized with an empty collection.
It also has the method add to add a Tool to its list and the method getTools that returns the list.
*/