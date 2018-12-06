package javaWeek_5.exercise6;

public class AddDoor implements Step{

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("door");
    }
}
