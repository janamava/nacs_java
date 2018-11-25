package group_projects.marioPyramid;

import java.util.Scanner;

public class MarioPyramid {

    public static void main(String[] args) {

        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number > 0) && (number < 23)) {


            for (int times = number; times >0; times--) {


                for (int position = 0; position < times -1; position++) {
                    System.out.printf(" ");

                }

                for (int position = times - 1; position < number + 1; position++) {

                    System.out.printf("#");
                }

                System.out.printf("\n");
            }
        }


    }
}
