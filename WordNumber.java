/* Created By InteliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 14-07-2020
 *  Time: 11:44 PM
 */
import java.util.Scanner;
public class WordNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number in between 0 to 100: ");
        int num = scanner.nextInt();
        String once = "";
        String tense = "";
        int oncedigit = num % 10;
        int tensedigit = num / 10;
        if (num == 100) {
            System.out.println("Hundred");
        } else {
            if (oncedigit == 1) {
                once = "one";
            } else if (oncedigit == 2) {
                once = "two";
            } else if (oncedigit == 3) {
                once = "three";
            } else if (oncedigit == 4) {
                once = "four";
            } else if (oncedigit == 5) {
                once = "five";
            } else if (oncedigit == 6) {
                once = "six";
            } else if (oncedigit == 7) {
                once = "seven";
            } else if (oncedigit == 8) {
                once = "eight";
            } else if (oncedigit == 9) {
                once = "nine";
            } else {
                once = "";
            }

            if (tensedigit == 1) {
                if (oncedigit == 1) {
                    tense = "Eleven";
                } else if (oncedigit == 2) {
                    tense = "Twelve";
                } else if (oncedigit == 3) {
                    tense = "Thirteen";
                } else if (oncedigit == 4) {
                    tense = "Fourteen";
                } else if (oncedigit == 5) {
                    tense = "Fifteen";
                } else if (oncedigit == 6) {
                    tense = "Sixteen";
                } else if (oncedigit == 7) {
                    tense = "Seventeen";
                } else if (oncedigit == 8) {
                    tense = "Eighteen";
                } else if (oncedigit == 9) {
                    tense = "Nineteen";
                } else {
                    tense = "Ten";
                }
            } else if (tensedigit == 2) {
                tense = "Twenty";
            } else if (tensedigit == 3) {
                tense = "Thirty";
            } else if (tensedigit == 4) {
                tense = "Fourty";
            } else if (tensedigit == 5) {
                tense = "Fifty";
            } else if (tensedigit == 6) {
                tense = "Sixty";
            } else if (tensedigit == 7) {
                tense = "Seventy";
            } else if (tensedigit == 8) {
                tense = "Eighty";
            } else {
                tense = "Ninty";
            }
            System.out.println(tense + " " + once);
        }
    }
}
