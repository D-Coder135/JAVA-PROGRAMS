/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 14-08-2020
 *  Time: 07:53 PM
 */

import java.util.Scanner;

public class ExtractionnOfCharactersWithASCIICode {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter any String word: ");
        scannerObject.close();
        String stringWord = scannerObject.next();
        for (int index = 0; index < stringWord.length(); index++) {
            char everyCharacter = stringWord.charAt(index);
            System.out.println("Character = " + everyCharacter + " It's ASCII Code = " + (int) everyCharacter);
        }
    }
}
