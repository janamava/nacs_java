package javaWeek_6.exercise5;

import java.util.Arrays;
import java.util.List;

public class CreditCards {

    public static List<CreditCard> asList(){
        return Arrays.asList(new AmericanExpress(), new MasterCard(), new Visa());
    }
}
