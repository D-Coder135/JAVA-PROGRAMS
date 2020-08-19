/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 19-08-2020
 *  Time: 11:01 PM
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class NameFormatWithStringTokenizer {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String fullName = scannerObject.nextLine();
        scannerObject.close();
        StringBuilder nameinProperFormat = new StringBuilder();
        StringTokenizer stringTokenizerObject = new StringTokenizer(fullName);
        int tokenCounter = stringTokenizerObject.countTokens();
        for (int index = 1; index < tokenCounter; index++) {
            String eachWord = stringTokenizerObject.nextToken();
            char firstCharacterOfEachWord = eachWord.charAt(0);
            nameinProperFormat.append(firstCharacterOfEachWord).append(".");
        }
        nameinProperFormat.append(stringTokenizerObject.nextToken());
        System.out.println("Entered Name in short format ----> " + nameinProperFormat);
    }
}
