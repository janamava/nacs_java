package javaWeek_6.exercise5;

public class CardCheckerApplication {

    public static void main(String[] args) {

        CardChecker checker = new CardChecker();
        String cardName = checker.check(378282246310005L);
        System.out.println(cardName);
    }
}
