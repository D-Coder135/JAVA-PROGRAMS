/* Created By InteliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 15-07-2020
 *  Time: 11:22 AM
 */
import java.util.Scanner;
public class ScannerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String studentname = scanner.nextLine();
        System.out.println("Enter father's name: ");
        String fathername = scanner.nextLine();
        System.out.println("Enter mother's name: ");
        String mothername = scanner.nextLine();
        System.out.println("Enter Permanent address: ");
        String address = scanner.nextLine();
        System.out.println("Enter Student's mobile number: ");
        long mobno = scanner.nextLong();
        System.out.println("Enter Father's mobile number: ");
        long fathernumber = scanner.nextLong();
        System.out.println("Enter Mother's mobile number: ");
        long mothernumber = scanner.nextLong();
        System.out.println("Enter percentage in 12th: ");
        double percentage12th = scanner.nextDouble();
        System.out.println("Enter percentage in 10th: ");
        double percentage10th = scanner.nextDouble();
        System.out.println("Hostel choice (true/false): ");
        boolean choice = scanner.nextBoolean();
        byte year = 1;
        char section = 'A';
        short classrollno = 1;
        int univrollno = 201510001;
        String course = "B.Tech CSE";
        System.out.println("Student Name: " + studentname);
        System.out.println("Father's Name: " + fathername);
        System.out.println("Mother's Name: " + mothername);
        System.out.println("Permanent Address: " + address);
        System.out.println("Student's Contact Number: " + mobno);
        System.out.println("Father's Contact Number: " + fathernumber);
        System.out.println("Mother's Contact Number: " + mothernumber);
        System.out.println("Percentage in 12th: " + percentage12th);
        System.out.println("Percentage in 10th: " + percentage10th);
        System.out.println("Hostel Choice: " + choice);
        System.out.println("Year: " + year);
        System.out.println("Section: " + section);
        System.out.println("Class Roll Number: " + classrollno);
        System.out.println("University Roll Number: " + univrollno);
        System.out.println("Course: " + course);
    }

}

