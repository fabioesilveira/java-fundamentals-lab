import java.util.Scanner;

public class Exercise04Profile {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String name = scnr.nextLine();
        int age = scnr.nextInt();
        String food = scnr.next();

        System.out.println(name + " is " + age + " years old and loves " + food + ".");

        scnr.close();
    }
}
