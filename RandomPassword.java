/* Created By InteliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 18-07-2020
 *  Time: 08:09 PM
 */

import java.util.Random;

public class RandomPassword {
    public static String generatePassword() {
        StringBuilder response = new StringBuilder();
        Random random = new Random();
        int totalNumberOfCharInPass = 10;
        final int ASCII_CODE_OF_ZERO = 48;
        final int ASCII_CODE_OF_NINE = 57;
        final int ASCII_CODE_OF_A = 65;
        final int ASCII_CODE_OF_Z = 90;
        final int ASCII_CODE_OF_LOWERCASE_A = 97;
        final int ASCII_CODE_OF_LOWERCASE_Z = 122;
        final int LAST_ASCII_VALUE = 126;
        for (int beginningOfAsciiValue = 33; beginningOfAsciiValue < LAST_ASCII_VALUE; beginningOfAsciiValue++) {
            char anyRandom = (char) random.nextInt(beginningOfAsciiValue);
            if (anyRandom == '!' || anyRandom == '#' || anyRandom == '@' || anyRandom == ',' || anyRandom == '"' || anyRandom == '.' || anyRandom == '$' || anyRandom == '%' || anyRandom == '^' || anyRandom == '&') {
                response.append(anyRandom);
            } else if (((int) anyRandom >= ASCII_CODE_OF_ZERO) && ((int) anyRandom <= ASCII_CODE_OF_NINE)) {
                response.append(anyRandom);
            } else if (((int) anyRandom >= ASCII_CODE_OF_A) && ((int) anyRandom <= ASCII_CODE_OF_Z)) {
                response.append(anyRandom);
            } else if ((((int) anyRandom >= ASCII_CODE_OF_LOWERCASE_A) && ((int) anyRandom <= ASCII_CODE_OF_LOWERCASE_Z))) {
                response.append(anyRandom);
            } else {
                continue;
            }
            if (response.length() == totalNumberOfCharInPass) {
                break;
            }
        }
        return response.toString();
    }

    public static void main(String[] args) {
        String password = RandomPassword.generatePassword();
        System.out.println("Random Password = " + password);
    }
}
