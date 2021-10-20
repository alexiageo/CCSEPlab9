package app;

import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    private int threshold = 1000;
    private int surcharge = 10;

    public static void main(String[] args) {

        Main app = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("[?] Enter an amount (e.g. 10, 1000): ");
        String amount = scanner.next();

        if(app.approval(amount)) {
            System.out.println("[i] The amount requires approval");
        } else {
            System.out.println("[i] The amount does not require approval");
        }

    }

    /**
     * Checks if a given ammount requires approval
     * Return true if a given amount is bigger than a given threshold
     * @return boolean
     */
    public boolean approval(String value){
        /* Pre-condition check, safe addition*/

        //make all numbers BigInteger because initial input could already be out of int range
        BigInteger val = new BigInteger(value);
        BigInteger surch = BigInteger.valueOf(surcharge);
        BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);

        if (val.signum() == 1) //if number is positive
        {
            if (val.compareTo(maxInt.subtract(surch)) == 1 // if val > maxInt - surcharge : overflow
            ||  val.compareTo(minInt.subtract(surch)) == -1
            ||  val.compareTo(BigInteger.ZERO) == 0) //or if val < minInt - surcharge : underflow
            {
                //if overflow occurs, stop execution
                throw new ArithmeticException("Invalid number. Overflow detected.");
            }
        }
        else
        {
                throw new ArithmeticException("Negative number not allowed.");
        }

        int amount = Integer.parseInt(value) + surcharge;
       
        if(amount >= threshold) {
            return true;
        }
        return false;
   }

}
