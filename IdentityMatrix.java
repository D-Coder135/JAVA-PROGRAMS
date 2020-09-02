/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 02-09-2020
 *  Time: 11:29 PM
 */

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the order of the identity matrix: ");
        byte matrixSize = scanner.nextByte();
        byte[][] identityMatrix = new byte[matrixSize][matrixSize];
        for (byte rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
            for (byte columnIndex = 0; columnIndex < matrixSize; columnIndex++) {
                if (rowIndex == columnIndex) {
                    identityMatrix[rowIndex][columnIndex] = 1;
                } else {
                    identityMatrix[rowIndex][columnIndex] = 0;
                }
            }
        }
        System.out.println("Identity Matrix of " + matrixSize + " is :");
        for (byte rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
            for (byte columnIndex = 0; columnIndex < matrixSize; columnIndex++) {
                System.out.print(identityMatrix[rowIndex][columnIndex] + "\t");
            }
            System.out.println();
        }
    }
}
