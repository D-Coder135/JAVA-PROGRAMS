/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 27-07-2020
 *  Time: 09:54 PM
 */
import java.util.Scanner;
public class ForEachIntro {
    public static void main(String[] args) {
        Scanner scannerObject= new Scanner(System.in);
        final int NUMBER_OF_OS=5;
        String[] namesOfOS=new String[NUMBER_OF_OS];
        System.out.println("Enter The Names Of Different OS: ");
        for (int counterForInput = 0; counterForInput < NUMBER_OF_OS; counterForInput++) {
            namesOfOS[counterForInput]= scannerObject.nextLine();
        }
        scannerObject.close();
        //Now for Reading an array we can use an enhanced version of for loop i.e.,for each or enhanced for.
        for (String nameOfOS : namesOfOS) {
            System.out.println(nameOfOS);

        }
    }
}
