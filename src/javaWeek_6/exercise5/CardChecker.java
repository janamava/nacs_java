package javaWeek_6.exercise5;

import java.util.List;

public class CardChecker {

    public String check(Long card) {

        LuhnsAlgorithmValidator luhn = new LuhnsAlgorithmValidator();
        if (luhn.isValid(card)) {
            String cardName = checkCards(card);
            return cardName;
        }
        return "INVALID";
    }


    public String checkCards(Long card) {
        List<CreditCard> creditCards = CreditCards.asList();
        for (CreditCard creditCard : creditCards) {
            if (creditCard.isValid(card)) {
                return creditCard.getName();
            }
        }
        return "invalid";
    }
}
