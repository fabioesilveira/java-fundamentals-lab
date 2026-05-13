import java.util.Scanner;

public class Exercise05EvenOdd {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0) {

            System.out.println("invalid input");

        } else {

            int sum = num1 + num2 + num3;

            if (sum % 2 == 0) {

                System.out.println("" + num1 + num2 + num3 + " The result is even!");

            } else {

                System.out.println("" + num1 + num2 + num3 + " The result is odd!");

            }
        }

        scnr.close();
    }
}
