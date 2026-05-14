import java.util.Scanner;

public class LabProgram {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
 
      double[] numbers = new double[3];

      numbers[0] = scnr.nextDouble();
      numbers[2] = scnr.nextDouble();
      numbers[3] = scnr.nextDouble();

      double average = numbers[0] + numbers[2] + numbers[3] / 3;

      scnr.close();
   }

}