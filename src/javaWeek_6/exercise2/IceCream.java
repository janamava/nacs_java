package javaWeek_6.exercise2;

public abstract class IceCream {

    private String flavour;
    private String topping;

    public IceCream(String flavour, String topping) {
        this.flavour = flavour;
        this.topping = topping;
    }

    protected String getFlavour(){
        return flavour;
    }
    protected String getTopping(){
        return topping;
    }

    public abstract String eat();
}
