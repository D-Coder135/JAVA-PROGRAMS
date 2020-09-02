/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 02-09-2020
 *  Time: 10:14 PM
 */

import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arrayOfRandomNumbers = new int[size];
        System.out.println("Enter " + size + " elements in the array");
        for (int index = 0; index < size; index++) {
            arrayOfRandomNumbers[index] = scanner.nextInt();
        }
        for (int precedingIndex = 0; precedingIndex < size - 1; precedingIndex++) {
            for (int succeedingIndex = precedingIndex + 1; succeedingIndex < size; succeedingIndex++) {
                if (arrayOfRandomNumbers[precedingIndex] > arrayOfRandomNumbers[succeedingIndex]) {
                    int swappingVariable = arrayOfRandomNumbers[precedingIndex];
                    arrayOfRandomNumbers[precedingIndex] = arrayOfRandomNumbers[succeedingIndex];
                    arrayOfRandomNumbers[succeedingIndex] = swappingVariable;
                }
            }
        }
        System.out.println("Array after sorting by selection sorting method: ");
        for (int eachElementOfTheArray : arrayOfRandomNumbers) {
            System.out.println(eachElementOfTheArray);
        }
    }
}
