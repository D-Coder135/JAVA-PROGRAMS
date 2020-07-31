/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 31-07-2020
 *  Time: 01:08 PM
 */

import java.util.Scanner;

public class CakeConfiguration {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String customerName = scannerObject.nextLine();
        System.out.println("Please enter your age: ");
        byte customerAge = scannerObject.nextByte();
        System.out.println("Enter the number of layers you want in your cake: ");
        byte layersCake = scannerObject.nextByte();
        numberOfFlames(customerAge, "`");
        System.out.println();
        numberOfCandles(customerAge, "|");
        System.out.println();
        numberOfLayers(customerAge, layersCake);
    }

    private static void numberOfCandles(byte customerAge, String s) {
        System.out.print("  ");
        for (byte numberOfCandles = 1; numberOfCandles <= customerAge; numberOfCandles++) {
            System.out.print(s);
        }
        System.out.print("  ");
    }

    private static void numberOfFlames(byte customerAge, String s) {
        System.out.print("  ");
        for (byte numberOfFlames = 1; numberOfFlames <= customerAge; numberOfFlames++) {
            System.out.print(s);
        }
        System.out.print("  ");
    }

    private static void numberOfLayers(byte customerAge, byte layersCake) {
        for (byte layers = 1; layers <= layersCake; layers++) {
            disigningCharacter1(customerAge, "@");
            System.out.println();
            designingCharacter2(customerAge, "=");
            System.out.println();
        }
    }

    private static void designingCharacter2(byte customerAge, String s) {
        for (int designingCharacters = 1; designingCharacters <= customerAge + 4; designingCharacters++) {
            System.out.print(s);
        }
    }

    private static void disigningCharacter1(byte customerAge, String s) {
        for (int designingCharacters = 1; designingCharacters <= customerAge + 4; designingCharacters++) {
            System.out.print(s);
        }
    }
}
