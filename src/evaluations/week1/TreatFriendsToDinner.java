package evaluations.week1;

import java.util.Scanner;

public class TreatFriendsToDinner {

    public static void main(String[] args) {
        Integer moneyWallet = askDerek();
        Integer paymentFriends = askFriends();

        if (moneyWallet < paymentFriends) {
            System.out.println("Sorry, let's do it some other time.");
            return;
        }
        Integer ownPayment = paymentDerek();
        Integer newSum = paymentFriends + ownPayment;

        if (moneyWallet < newSum) {
            System.out.println("Sorry, miscalculated. Let's do it some other time.");
        }


    }

    public static Integer askDerek() {
        System.out.println("How much money does Derek have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Integer numberFriends() {
        System.out.println("How many friends are coming?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static Integer askFriends() {

        Scanner scanner = new Scanner(System.in);
        Integer numberOfFriends = numberFriends();
        Integer counter = 0;
        for (int position = 0; position < numberOfFriends; position++) {
            System.out.println("How much should you pay?");
            Integer number = scanner.nextInt();
            counter = counter + number;
        }
        return counter;
    }

    public static Integer paymentDerek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much should I pay?");
        Integer paymentDerek = scanner.nextInt();
        return paymentDerek;
    }
}
