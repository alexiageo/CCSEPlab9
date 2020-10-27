package app;

import java.util.Scanner;

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
       double amount = Double.parseDouble(value);
       return amount + (amount * tax);
   }

}
