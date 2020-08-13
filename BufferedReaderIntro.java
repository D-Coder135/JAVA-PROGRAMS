/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 13-08-2020
 *  Time: 07:24 PM
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderIntro {
    /*
     * Code to take roll number, name and percentage marks of a student from the end user with the help of
     * BufferedReader class and print it.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the student: ");
        String studentName = bufferedReaderObject.readLine();
        System.out.println("Enter the roll number of the student: ");
        byte studentRollNumber = Byte.parseByte(bufferedReaderObject.readLine());
        System.out.println("Enter the percentage obtained by the student: ");
        double studentPercentage = Double.parseDouble(bufferedReaderObject.readLine());
        System.out.println("Details of the student are --->");
        System.out.println("Name= " + studentName);
        System.out.println("Roll number= " + studentRollNumber);
        System.out.println("Percentage Obtained= " + studentPercentage);
    }
}
