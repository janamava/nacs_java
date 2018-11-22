package javaWeek3.exercise3;

public class NumberCorrector {

    public Integer correct(Double number) {

        System.out.println("Number displayed on the screen: " + number);
        number = Math.abs(number);
        number = Math.floor(number);

        Integer corrected = number.intValue(); //intValue converts double into integer
        System.out.println("Here is the corrected number " + corrected);
        return corrected;
    }
}
/*

 Random random = new Random();
        Double input = random.nextDouble();
The NumberCorrector class has no attributes.
It has the correct method that receives a Double
and returns the Integer version of it in absolute terms.
 */