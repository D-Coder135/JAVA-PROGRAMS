/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 19-08-2020
 *  Time: 11:42 PM
 */

import java.util.Scanner;

public class BubbleSortingAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        String[] arrayOfStrings = new String[size];
        System.out.println("Enter any " + size + " Strings in the array: ");
        for (int index = 0; index < size; index++) {
            arrayOfStrings[index] = scanner.nextLine();
        }
        scanner.close();
        String swappingVariable;
        for (int totalNumberOfChecks = arrayOfStrings.length - 1; totalNumberOfChecks >= 1; totalNumberOfChecks--) {
            for (int index = 0; index < totalNumberOfChecks; index++) {
                if (arrayOfStrings[index].compareTo(arrayOfStrings[index + 1]) > 0) {
                    swappingVariable = arrayOfStrings[index];
                    arrayOfStrings[index] = arrayOfStrings[index + 1];
                    arrayOfStrings[index + 1] = swappingVariable;
                }
            }
        }
        System.out.println("Sorted String: ");
        for (String eachString : arrayOfStrings) {
            System.out.println(eachString);
        }
    }
}
