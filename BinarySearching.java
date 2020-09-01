/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 01-09-2020
 *  Time: 07:27 PM
 */


/*
 * In binary searching there are some conditions which the elements of the array
 * must follow --->
 * 1. The elements of the array must already be sorted in ascending order.
 * 2. The elements of the array must not be duplicated i.e., one element should appear only once in the array.
 * Note --> In binary searching, searching starts from the middle.
 */

import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter te size of the array: ");
        byte size = scanner.nextByte();
        int[] arrayOfRollNumbers = new int[size];
        System.out.println("Enter " + size + " elements in the array: ");
        for (byte index = 0; index < size; index++) {
            arrayOfRollNumbers[index] = scanner.nextInt();
        }
        System.out.println("Enter the number you want to search in the array: ");
        int choice = scanner.nextInt();
        scanner.close();
        int lowestIndexOfTheArray = 0;
        int higeshtIndexOfTheArray = size - 1;
        boolean choiceFound = false;
        while (lowestIndexOfTheArray <= higeshtIndexOfTheArray) {
            int middleIndex = (lowestIndexOfTheArray + higeshtIndexOfTheArray) / 2;
            if (choice == arrayOfRollNumbers[middleIndex]) {
                choiceFound = true;
                break;
            } else if (choice < arrayOfRollNumbers[middleIndex]) {
                higeshtIndexOfTheArray = middleIndex - 1;
            } else {
                lowestIndexOfTheArray = middleIndex + 1;
            }
        }
        if (choiceFound) {
            System.out.println("Searching Completed! Choice found.");
        } else {
            System.out.println("Searching Completed! Choice Not Found.");
        }
    }
}
