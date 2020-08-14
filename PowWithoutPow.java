/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 14-08-2020
 *  Time: 07:13 PM
 */

import java.util.Scanner;

public class PowWithoutPow {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int baseNumber = scannerObject.nextInt();
        System.out.println("Enter the power: ");
        int powerNumber = scannerObject.nextInt();
        scannerObject.close();
        long result = 1;
        if (powerNumber == 0) {
            System.out.println("Result is = " + result);
        } else {
            while (powerNumber != 0) {
                result *= baseNumber;
                powerNumber -= 1;
            }
            System.out.println("Result is = " + result);
        }
    }
}
