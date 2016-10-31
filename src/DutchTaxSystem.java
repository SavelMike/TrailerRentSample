import java.util.Scanner;

/**
 * Created by Михаил on 31.10.2016.
 */
public class DutchTaxSystem {
    public static void main(String[] args) {
        new DutchTaxSystem().run();
    }

    public void run() {
        double[] TaxPercentage = {36.55, 40.15, 40.15, 52};
        int[] TaxBrackets = {19922, 33715, 66421, Integer.MAX_VALUE};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int Salary = scanner.nextInt();

        int prevTaxBracket = 0;
        int TotalTax = 0;
        for (int i = 0; i < 4; i++) {
            if (Salary > TaxBrackets[i]) {
                int TaxBase = TaxBrackets[i] - prevTaxBracket;
                System.out.println("Bracket " + (i + 1) + ": " + TaxPercentage[i] + "% of " + TaxBase + " = " +
                        (int)(TaxBase * TaxPercentage[i] / 100));
                TotalTax += (int)(TaxBase * TaxPercentage[i] / 100);
            } else  {
                if (prevTaxBracket > Salary) {
                    System.out.println("Bracket " + (i + 1) + ": "  + TaxPercentage[i] + "% of 0 = 0 ");
                } else {
                    int TaxBase = Salary - prevTaxBracket;
                    System.out.println("Bracket " + (i + 1) + ": " + TaxPercentage[i] + "% of " +
                            TaxBase + " = " + (int)(TaxBase * TaxPercentage[i] / 100));
                    TotalTax += (int)(TaxBase * TaxPercentage[i] / 100);
                }
            }
            prevTaxBracket = TaxBrackets[i];
        }
        System.out.println("Total: " + TotalTax);
    }
}