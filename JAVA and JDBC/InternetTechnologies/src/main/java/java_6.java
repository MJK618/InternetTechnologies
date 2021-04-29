import java.util.Scanner;


class Frac {
    private int numerator;             // Fraction numerator
    private int denominator;           // Fraction denominator

    /*-----------------------------------------------------------------
     * constructor
     * If fraction is negative,
     * put negative number in numerator
     */
    public Frac(int num, int denom) {
        numerator = (denom < 0 ? -num : num);
        denominator = (denom < 0 ? -denom : denom);

    }

    /*-----------------------------------------------------------------
     * setNumerator
     * numerator is set to be the given parameter
     */
    public void setNumerator(int num) {
        numerator = num;

    }

    /*-----------------------------------------------------------------
     * getNumerator
     * return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /*-----------------------------------------------------------------
     * setDenominator
     * denominator is set to be the
     * given parameter (zero is ignored),
     * if denominator is negative,
     * numerator is adjusted
     */
    public void setDenominator(int denom) {
        try {
            if (denom > 0) {
                denominator = denom;

            }
            if (denom < 0) {
                numerator = -numerator;
                denominator = -denom;

            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() +
                    " Exception Condition occurred" +
                    " [Division by zero]");

        }
    }

    /*-----------------------------------------------------------------
     * getDenominator
     * return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /*-----------------------------------------------------------------
     * reduce
     * reduce Fraction to lowest terms
     * by finding largest common denominator
     * and dividing it out
     */
    public void reduce() {
        // find the larger of the numerator and denominator
        try {
            int x = 1 / denominator;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() +
                    " Exception Condition occurred" +
                    " [Division by zero]");

        }


        int n = numerator,
                d = denominator,
                largest;

        if (numerator < 0) {
            n = -numerator;
        }
        if (n > d) {
            largest = n;
        } else {
            largest = d;
        }

        // find the largest number
        // that divide the numerator and
        // denominator evenly
        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (numerator % i == 0 &&
                    denominator % i == 0) {
                gcd = i;
                break;
            }
        }

        // divide the largest common denominator
        // out of numerator, denominator
        if (gcd != 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
    }
}

public class java_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("\nThis program will depict" +
                " simplest ratio of fractions and " +
                "catch zero division error");

        while (choice <= 5) {
            System.out.print("\nEnter Numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter Denominator: ");
            int den = sc.nextInt();
            Frac f = new Frac(num, den);
            f.setDenominator(den);
            f.setNumerator(num);
            f.reduce();
            choice = choice + 1;
            System.out.println("The Ratio => " +
                    f.getNumerator() +
                    " : " +
                    f.getDenominator());
        }
    }
}