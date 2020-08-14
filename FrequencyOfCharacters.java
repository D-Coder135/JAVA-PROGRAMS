/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 14-08-2020
 *  Time: 08:02 PM
 */

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter any Word: ");
        String enteredWord = scannerObject.next();
        scannerObject.close();
        byte lengthOfWord = (byte) enteredWord.length();
        for (byte index = 0; index < lengthOfWord; index++) {
            byte frequencyOfCharacter = (byte) 1;
            char eachCharacter = enteredWord.charAt(index);
            for (byte occurence = (byte) (index + 1); occurence < lengthOfWord; occurence++) {
                char nextCharacter = enteredWord.charAt(occurence);
                if (String.valueOf(nextCharacter).equalsIgnoreCase(String.valueOf(eachCharacter))) {
                    frequencyOfCharacter += 1;
                    enteredWord = enteredWord.replace(nextCharacter, ' ');
                }
            }
            if (eachCharacter != ' ') {
                System.out.println("Character = " + eachCharacter + " Frequency = " + frequencyOfCharacter);
            }
        }
    }
}
