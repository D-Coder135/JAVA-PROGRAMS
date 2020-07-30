/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 30-07-2020
 *  Time: 10:35 PM
 */
import java.util.Scanner;
public class AtmPin {
    public static void main(String[] args) {
        final short CORRECT_PIN=8542;
        final byte TOTAL_ATTEMPTS=4;
        Scanner scannerObject =new Scanner(System.in);
        System.out.println("Please enter your pin.");
        short enteredPin=scannerObject.nextShort();
        boolean pinMatches= (enteredPin == CORRECT_PIN);
        if(pinMatches){
            System.out.println("Pin Matches.");
        }
        else{
            for (byte attempts = 2; attempts <= TOTAL_ATTEMPTS; attempts++) {
                System.out.println("Incorrect Pin!, Please re-enter:");
                enteredPin = scannerObject.nextShort();
                pinMatches = (enteredPin == CORRECT_PIN);
                if (pinMatches) {
                    System.out.println("Pin Matches.");
                    break;
                }
                if(attempts==TOTAL_ATTEMPTS){
                    System.out.println("Number of attempts exceeded.");
                }
            }
        }
        scannerObject.close();
    }
}
