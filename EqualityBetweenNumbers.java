/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 13-08-2020
 *  Time: 07:53 PM
 */

import java.util.Scanner;

public class EqualityBetweenNumbers {
    public static void byUsingIf_ElseConditionaStatement() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter any three numbers to check equality between them: ");
        int firstNumber = scannerObject.nextInt();
        int secondNumber = scannerObject.nextInt();
        int thirdNumber = scannerObject.nextInt();
        scannerObject.close();
        boolean completeEquality = firstNumber == thirdNumber && firstNumber == secondNumber;
        boolean equalityBetweenFirstAndSecondNumbers = firstNumber == secondNumber;
        boolean equalityBetweenSecondAndThirdNumbers = secondNumber == thirdNumber;
        boolean equalityBetweenFirstAndThirdNumbers = firstNumber == thirdNumber;
        if (completeEquality) {
            System.out.println("Every entered are equal!");
        } else if (equalityBetweenFirstAndSecondNumbers) {
            System.out.println("First and second number entered are equal!");
        } else if (equalityBetweenSecondAndThirdNumbers) {
            System.out.println("Second and third number entered are equal!");
        } else if (equalityBetweenFirstAndThirdNumbers) {
            System.out.println("First and third number entered are equal!");
        } else {
            System.out.println("Numbers entered are different! ");
        }

    }

    public static void byUsingTernanryCondotionalStatement() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter any three numbers to check equality between them: ");
        int firstNumber = scannerObject.nextInt();
        int secondNumber = scannerObject.nextInt();
        int thirdNumber = scannerObject.nextInt();
        scannerObject.close();
        String equalityCheck = firstNumber == secondNumber && firstNumber == thirdNumber ? "Every number entered are equal!"
                : firstNumber == secondNumber ? "First and second number entered are equal!"
                : secondNumber == thirdNumber ? "Second and third number entered are equal!"
                : firstNumber == thirdNumber ? "First and third number entered are equal!" : "Numbers entered are different!";
        System.out.println(equalityCheck);
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter your choice by which you want to check the equality between numbers (1: By if-else OR 2: By ternary) : ");
        byte choice = scannerObject.nextByte();
        if (choice == 1) {
            byUsingIf_ElseConditionaStatement();
        } else {
            byUsingTernanryCondotionalStatement();
        }
    }
}
