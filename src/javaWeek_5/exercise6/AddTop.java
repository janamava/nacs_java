package javaWeek_5.exercise6;

public class AddTop implements Step{

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("top");
    }
}
