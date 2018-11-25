package javaWeek_2.simplerExercises.exercise3;

public class Derek {

    private Tool tool; // here we define an attribute that Derek must have in order to be Derek.
                       // this is not a constructor!

    public void setTool(Tool tool) { // that's a Setter method (Alt+Insert),
                                     // that takes a tool as argument and gets a value for it
        this.tool = tool;
    }

    private Boolean canHangPainting() {
        return tool!=null && tool.getName() == "hammer"; //!= had to come first, only after that it worked
    }

    void hangPainting() {
        if (canHangPainting()) {
            System.out.println("I can hang the painting!");
        }
        else {
            System.out.println("I am missing a hammer.");
        }
    }

}
/*
Derek has a tool as attribute, but he does not receive it through the constructor.
Instead he receives it with a setTool method. He also has the methods canHangPainting and hangPainting.

In the canHangPainting Derek checks if he has a tool called hammer. If so he returns true, otherwise false.

In the hangPainting method, if Derek canHangPainting it will say he can hang the painting.
Otherwise he will say that he’s missing the hammer.
 */