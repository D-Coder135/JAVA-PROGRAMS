/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 07-08-2020
 *  Time: 11:56 PM
 */
public class RandomLottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = {245_4568_72, 542_9875_36, 789_9856_36, 542_4588_78, 658_9875_22, 123_6584_85};
        int randomIndex = (int) (Math.random() * lotteryNumbers.length);
        System.out.println("The Lottery number which got lucky is: " + lotteryNumbers[randomIndex]);
    }
}
