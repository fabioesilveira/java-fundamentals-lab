import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num1;
      int num2;
      int num3;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();

      if (num1 < 0 || num2 < 0 || num3 < 0) {

         System.out.println("Invalid input!");

      } else {
         
         int sum = num1 + num2 + num3;

         if (sum % 2 == 0) {
            
            System.out.println(" the sum is even!");

         } else {
            
            System.out.println(" the sum is odd");
         }
      }

      scnr.close();
   }
}