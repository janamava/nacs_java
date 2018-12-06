package javaWeek_5.exercise6;

public class AddShelf implements Step{

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("shelf");
    }
}