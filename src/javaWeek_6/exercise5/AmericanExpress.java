package javaWeek_6.exercise5;

public class AmericanExpress extends CreditCard {

    @Override
    public String getName() {
        return "American Express";
    }

    @Override
    public Boolean isValid(Long creditCardNumber) {
        String numberToString = creditCardNumber.toString();
        if(numberToString.length() == 15 && numberToString.startsWith("34")
                || numberToString.startsWith("37")){
            return true;
        }
        return false;
    }
}
