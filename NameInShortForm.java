/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 16-08-2020
 *  Time: 11:36 PM
 */

import java.util.Scanner;

public class NameInShortForm {
    public static void main(String[] args) {
        Scanner scannnerObject = new Scanner(System.in);
        System.out.println("Enter the full name: ");
        String enteredName = scannnerObject.nextLine();
        scannnerObject.close();
        String formatedName = "";
        enteredName.trim();
        for (int indexTillFirstSpace = 0; indexTillFirstSpace < enteredName.indexOf(" ") + 1; indexTillFirstSpace++) {
            char eachCharacter = enteredName.charAt(indexTillFirstSpace);
            if (eachCharacter == ' ') {
                String partsOfName = enteredName.substring(0, indexTillFirstSpace);
                formatedName = formatedName.concat(String.valueOf(partsOfName.charAt(0)));
                formatedName = formatedName.concat(". ");
                enteredName = enteredName.substring(indexTillFirstSpace + 1);
            }
        }
        for (int indexTillSecondSpace = 0; indexTillSecondSpace < enteredName.indexOf(" ") + 1; indexTillSecondSpace++) {
            char eachCharacter = enteredName.charAt(indexTillSecondSpace);
            if (eachCharacter == ' ') {
                String partsOfName = enteredName.substring(0, indexTillSecondSpace);
                formatedName = formatedName.concat(String.valueOf(partsOfName.charAt(0)));
                formatedName = formatedName.concat(". ");
                enteredName = enteredName.substring(indexTillSecondSpace + 1);
            }
        }
        formatedName = formatedName.concat(enteredName);
        System.out.println("Name in proper format --> " + formatedName);
    }
}
