import java.util.Scanner;

public class Exercise06NameFormatter {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String fullName = scnr.nextLine();

        String[] parts = fullName.split(" ");

        if (parts.length == 3) {

            System.out.println(parts[2].charAt(0) + "., " + parts[0] + " " + parts[1].charAt(0) + ".");

        } else {

            System.out.println(parts[1].charAt(0) + "., " + parts[0]);
        }

        scnr.close();
    }
}
