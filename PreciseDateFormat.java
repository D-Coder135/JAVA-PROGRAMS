/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 13-08-2020
 *  Time: 08:31 PM
 */

import java.util.Scanner;

public class PreciseDateFormat {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the date: ");
        byte date = scannerObject.nextByte();
        if (date == 0 || date > 31) {
            System.err.println("Entered date is not possible!");
        } else {
            System.out.println("Enter the month: ");
            byte month = scannerObject.nextByte();
            if (month > 12) {
                System.err.println("Entered Month Doesn't exists! ");
            } else if (month < 1) {
                System.err.println("Entered Month Doesn't exists! ");
            } else {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (date > 30) {
                        System.err.println("The entered month is of 30 days!");
                    }
                } else if (month == 2) {
                    if (date > 28) {
                        System.err.println("February month is only of 28 days!");
                    }
                } else {
                    System.out.println("Enter the year: ");
                    short year = scannerObject.nextShort();
                    int numberOfDigitsInYear = 0;
                    int copyYear = year;
                    while (copyYear != 0) {
                        numberOfDigitsInYear += 1;
                        copyYear = copyYear / 10;
                    }
                    if (numberOfDigitsInYear != 4) {
                        System.err.println("Enter year is not in proper format! ");
                    } else {
                        System.out.println("The date entered is in proper format --> ");
                        System.out.println(date + " / " + month + " / " + year);
                    }


                }
            }
        }
    }
}
