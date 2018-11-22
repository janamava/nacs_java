package javaWeek2.exercise1and2;

public class Hiker {

    private String name;                 // this is an attribute, that describes everything the idea of an
                                         // object has. In this case it has a name.

    public Hiker(String name) {         //here in parentheses is must have obligation without which object
                                        // can not be created.
        this.name = name;               // this is a constructor, a tool for making new Hikers.
                                        // one at a time in any class as long as we have access to this file
    }
    public String getName() {           //  this is a javaWeek2.exercise1and2.Hiker method
        return name;
    }

}
