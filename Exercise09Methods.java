import java.util.Random;
import java.util.Scanner;

public class Exercise09Methods {

    // WRITE THE METHOD
    public static boolean showResults(Random rand) {
        int number = rand.nextInt(2);

        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Seed used in develop mode

        int times = scnr.nextInt();

        for (int index = 0; index < times; index++) {
            System.out.println(showResults(rand));
        }

        scnr.close();
    }
}
