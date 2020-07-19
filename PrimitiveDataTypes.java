/* Created By InteliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 11-07-2020
 *  Time: 08:20 PM
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in which year you are: ");
        byte yearOfBtech = scanner.nextByte();
        System.out.println("Enter Your Class Roll number: ");
        short yourClassRollno = scanner.nextShort();
        System.out.println("Enter Your University Roll number: ");
        int yourUnivRollno = scanner.nextInt();
        System.out.println("Enter your Enrollment number: ");
        long yourEnrollNo = scanner.nextLong();
        System.out.println("Enter your last year CPI: ");
        float yourLastYrCPI = scanner.nextFloat();
        System.out.println("Enter your current SPI: ");
        double yourCurrentSPI = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Your Gender(M/F/T): ");
        char yourGender = scanner.nextLine().charAt(0);
        System.out.println("Opted For Hostel(true/false): ");
        boolean hostel = scanner.nextBoolean();
    }
}
