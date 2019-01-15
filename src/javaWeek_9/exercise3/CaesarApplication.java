package javaWeek_9.exercise3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CaesarApplication {

    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        String encrypted = caesar.cipher("AZaz", 1);
        System.out.println(encrypted);

    }
}

