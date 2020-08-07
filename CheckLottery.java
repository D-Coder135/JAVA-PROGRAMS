/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 08-08-2020
 *  Time: 12:11 AM
 */

import java.util.Scanner;

public class CheckLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lottery number to check your luck: ");
        int lotteryNumber = scanner.nextInt();
        int[] everyLotteryNumber = {lotteryNumber, 54897, 15497, 54789};
        int luckyLotteryNumber = (int) (Math.random() * everyLotteryNumber.length);
        if (lotteryNumber == luckyLotteryNumber) {
            System.out.println("Congrats! Your Lottery Number is the lucky one.");
        } else {
            System.out.println("Sorry, your lottery number is not the lucky one. Better luck next time.");
        }
    }
}
