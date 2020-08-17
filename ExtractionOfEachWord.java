/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 17-08-2020
 *  Time: 09:10 AM
 */

import java.util.Scanner;

public class ExtractionOfEachWord {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String enteredSentence = scannerObject.nextLine();
        scannerObject.close();
        String eachWord = "";
        System.out.println("Each word in a new line ---> ");
        for (int index = 0; index < enteredSentence.length(); index++) {
            eachWord = eachWord.concat(String.valueOf(enteredSentence.charAt(index)));
            if (enteredSentence.charAt(index) == ' ' || index == enteredSentence.length() - 1) {
                System.out.println(eachWord);
                eachWord = "";
            }
        }
    }
}
