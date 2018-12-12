package javaWeek_6.exercise5;

public class MasterCard extends CreditCard {

    @Override
    public String getName() {
        return "Master Card";
    }

    @Override
    public Boolean isValid(Long creditCardNumber) {
        String numberToString = creditCardNumber.toString();
        if(numberToString.length() == 16 && (numberToString.startsWith("51")
                || numberToString.startsWith("52") || numberToString.startsWith("53") ||
                numberToString.startsWith("54") || numberToString.startsWith("55"))){
            return true;
        }
        return false;
    }
}
