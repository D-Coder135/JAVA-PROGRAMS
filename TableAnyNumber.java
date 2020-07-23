/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 23-07-2020
 *  Time: 10:23 PM
 */

import java.util.Scanner;

public class TableAnyNumber {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter The Number Whose Table You want to Print: ");
        int numberOfEndUserChoice = scannerObject.nextInt();
        final int HIGHEST_MULTIPLE = 10;
        for (int multiples = 1; multiples <= HIGHEST_MULTIPLE; multiples++) {
            System.out.printf("%d * %d = %d\n", numberOfEndUserChoice, multiples, numberOfEndUserChoice * multiples);
        }
    }
}
