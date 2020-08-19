/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 19-08-2020
 *  Time: 11:23 PM
 */

import java.util.Scanner;

public class BubbleSortingNumbers {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the size of array of numbers: ");
        byte size = scannerObject.nextByte();
        int[] arrayOfNumbers = new int[size];
        System.out.println("Enter any " + size + " numbers in the array: ");
        for (int index = 0; index < size; index++) {
            arrayOfNumbers[index] = scannerObject.nextInt();
        }
        scannerObject.close();
        for (int totalNumberOfChecks = size - 1; totalNumberOfChecks >= 1; totalNumberOfChecks--) {
            for (int indexCheck = 0; indexCheck < totalNumberOfChecks; indexCheck++) {
                if (arrayOfNumbers[indexCheck] > arrayOfNumbers[indexCheck + 1]) {
                    int swappingVariable = arrayOfNumbers[indexCheck];
                    arrayOfNumbers[indexCheck] = arrayOfNumbers[indexCheck + 1];
                    arrayOfNumbers[indexCheck + 1] = swappingVariable;
                }
            }
        }
        System.out.println("The sorted array is ----> ");
        for (int eachElement : arrayOfNumbers) {
            System.out.println(eachElement);
        }
    }
}
