package javaWeek_5.exercise6;

public class AddLeg implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}
