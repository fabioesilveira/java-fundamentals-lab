import java.util.Scanner;

public class Exercise08ArrayAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double[] values = new double[3];

        values[0] = scnr.nextDouble();
        values[1] = scnr.nextDouble();
        values[2] = scnr.nextDouble();

        double average = (values[0] + values[1] + values[2]) / 3;

        System.out.println("The values are: " + values[0] + " " + values[1] + " " + values[2]);
        System.out.println("Average: " + average);

        scnr.close();
    }
}
