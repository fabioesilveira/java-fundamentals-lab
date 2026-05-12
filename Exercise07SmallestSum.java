import java.util.Scanner;

public class Exercise07SmallestSum {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int sum = 0;

        int num = scnr.nextInt();

        int smallest = num;

        while (num >= 0) {

            sum = num + sum;

            if (num < smallest) {

                smallest = num;
            }

            num = scnr.nextInt();
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);

        scnr.close();

    }
}
