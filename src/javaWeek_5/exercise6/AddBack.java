package javaWeek_5.exercise6;

public class AddBack implements Step{

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("back");
    }
}
