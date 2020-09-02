/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 02-09-2020
 *  Time: 10:34 PM
 */

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arrayOfMarks = new int[size];
        System.out.println("Enter " + size + " elements in the array: ");
        for (int index = 0; index < size; index++) {
            arrayOfMarks[index] = scanner.nextInt();
        }
        System.out.println("Enter the element which you want to search: ");
        int choice = scanner.nextInt();
        scanner.close();
        int counter = 0;
        for (int index = 0; index < size; index++) {
            if (choice == arrayOfMarks[index]) {
                counter = 1;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Searching Completed! Choice not found!");
        } else {
            System.out.println("Searching Completed! Choice found!");
        }
    }
}
