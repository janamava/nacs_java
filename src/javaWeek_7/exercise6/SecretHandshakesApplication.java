package javaWeek_7.exercise6;

import java.util.List;
import java.util.Scanner;

public class SecretHandshakesApplication {

    public static void main(String[] args) {

        SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Good evening, how much does this item cost?");
        Integer price = scanner.nextInt();
        List<Handshake> translated = translator.translate(price);
        for (Handshake handshake : translated) {
            System.out.println(handshake.getName());
        }
    }
}
