package javaWeek_6.exercise4;

public abstract class Money {

    private Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return ""+amount;
    }

    public Boolean isApplicable(Integer change){
        return change >= amount;
    }
}
