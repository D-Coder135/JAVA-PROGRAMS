/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 25-07-2020
 *  Time: 07:22 PM
 */

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int number = scannerObject.nextInt();
        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits += 1;
            number = number / 10;
        }
        System.out.println("Number Of Digits= " + numberOfDigits);
    }
}
