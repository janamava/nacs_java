package javaWeek_5.exercise6;

public class AddSide implements Step{
    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("side");
    }
}
