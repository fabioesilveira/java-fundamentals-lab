import java.util.Scanner;

public class Exercise02Addition {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int initial_num = scnr.nextInt();
        int base_num = scnr.nextInt();

        int sum1 = initial_num + base_num;
        int sum2 = sum1 + base_num;
        int sum3 = sum2 + base_num;

        System.out.println(sum1 + " " + sum2 + " " + sum3);

        scnr.close();
    }
}
