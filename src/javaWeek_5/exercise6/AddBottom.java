package javaWeek_5.exercise6;

public class AddBottom implements Step {

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("bottom");
    }
}
