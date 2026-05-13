public class Debt {

    private double debtRatio;

    public void setDR(double totalDebt, double totalAssets) {

        debtRatio = totalDebt / totalAssets;
    }

    public double getDR() {
        
        return debtRatio;

    }
}