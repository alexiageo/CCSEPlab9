package app;

import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    private static double tax = 0.10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[?] Enter an amount (e.g. 10, 1000): ");
        String amount = scanner.next();

        System.out.println("[i] The amount including tax is " + getTaxedTotal(amount));

    }

    /**
     * Return total taxed amount
     * @return double
     */
    public static double getTaxedTotal(String value) {
       BigDecimal amount = new BigDecimal(value);
       amount = amount.add(amount.multiply(BigDecimal.valueOf(tax)));
       return amount.doubleValue();
   }

}
