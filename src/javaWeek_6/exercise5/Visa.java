package javaWeek_6.exercise5;

public class Visa extends CreditCard {

    @Override
    public String getName() {
        return "Visa";
    }

    @Override
    public Boolean isValid(Long creditCardNumber) {
        String numberToString = creditCardNumber.toString();
        if(numberToString.length() == 13 || numberToString.length() == 16
                && numberToString.startsWith("4")){
            return true;
        }
        return false;
    }
}
