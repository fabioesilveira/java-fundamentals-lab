import java.util.Scanner;

public class Exercise11DebtRatio {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Debt debt1 = new Debt();

        double totalDebt;
        double totalAssets;

        // TODO: Read totalDebt and totalAssets

        totalDebt = scnr.nextDouble();
        totalAssets = scnr.nextDouble();

        // TODO: Pass values into setDR()
        debt1.setDR(totalDebt, totalAssets);

        // TODO: Print result using printf()
        System.out.printf("debt: %f assets: %f ratio: %f", totalDebt, totalAssets, debt1.getDR());

        scnr.close();
    }
}