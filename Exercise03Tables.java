import java.util.Scanner;

public class Exercise03Tables {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int tablesSize = 10;
        int guests, tablesFilled;

        guests = scnr.nextInt();

        tablesFilled = guests / tablesSize;

        System.out.println("Tables filled: " + tablesFilled);

        scnr.close();
    }
}
