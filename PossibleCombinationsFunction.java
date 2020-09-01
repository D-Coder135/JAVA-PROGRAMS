/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 01-09-2020
 *  Time: 11:24 PM
 */

import javax.swing.*;
import java.util.Scanner;

public class PossibleCombinationsFunction {
    final byte FIXED_LENGTH_OF_THE_STRING = 3;
    String inputtedString;

    public PossibleCombinationsFunction(String inputtedString) {
        this.inputtedString = inputtedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any possible 3 characters string: ");
        String inputtedString = scanner.next();
        PossibleCombinationsFunction classObject = new PossibleCombinationsFunction(inputtedString);
        classObject.getEveryPossibleCombination();
    }

    public void getEveryPossibleCombination() {
        int lengthOfTheEnteredCombination = inputtedString.length();
        if (lengthOfTheEnteredCombination != FIXED_LENGTH_OF_THE_STRING) {
            JOptionPane.showMessageDialog(null, "Length Of The String Exceeded!", "Error in inputted String!", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Every possible combination for inputted String: ");
            for (byte i = 0; i < FIXED_LENGTH_OF_THE_STRING; i++) {
                for (byte j = 0; j < FIXED_LENGTH_OF_THE_STRING; j++) {
                    for (byte b = 0; b < FIXED_LENGTH_OF_THE_STRING; b++) {
                        if (i != j && i != b && j != b) {
                            System.out.println(inputtedString.charAt(i) + "" + inputtedString.charAt(j) + "" + inputtedString.charAt(b));
                        }
                    }
                }
            }
        }
    }
}
