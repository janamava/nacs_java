package javaWeek_11.exercise2;

public class ConverterApp {

    public static void main(String[] args) {


        Converter converter = new Converter();

        String formatted = converter.toMilitaryTime("12:00:01 AM");
        System.out.println(formatted);

    }

}
