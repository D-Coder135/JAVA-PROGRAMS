/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 01-09-2020
 *  Time: 10:36 PM
 */

import java.util.Scanner;

public class MethodsIntro {
    int rollNumber;
    String nameOfTheStudent, passingDivision;
    float percentageGot, firstSemCPI, secondSemCPI, thirdsemCPI, averageCPI;

    public static void main(String[] args) {
        MethodsIntro classObject = new MethodsIntro();
        classObject.getStudentDetails();
        classObject.calculateMarks();
        classObject.printDetailsOfThStudent();
    }

    public void getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        nameOfTheStudent = scanner.nextLine();
        System.out.println("Enter Your Roll Number: ");
        rollNumber = scanner.nextInt();
        System.out.println("Enter CPI got in First Semester: ");
        firstSemCPI = scanner.nextFloat();
        System.out.println("Enter CPI got in Second Semester: ");
        secondSemCPI = scanner.nextFloat();
        System.out.println("Enter CPI got in Third Semester: ");
        thirdsemCPI = scanner.nextFloat();
    }

    public void calculateMarks() {
        averageCPI = (firstSemCPI + secondSemCPI + thirdsemCPI) / 3;
        if (averageCPI >= 8.0) {
            passingDivision = "First Division";
        } else if (averageCPI >= 6.5 && averageCPI < 8.0) {
            passingDivision = "Second Division";
        } else if (averageCPI >= 5.5 && averageCPI < 6.5) {
            passingDivision = "Third Division";
        } else {
            passingDivision = "Fourth Division";
        }
        percentageGot = averageCPI * 10;
    }

    public void printDetailsOfThStudent() {
        System.out.printf("%10s\t%10s\t%20s\t%15s\t%10s\t", "Roll Number", "Name", "AverageCPI", "Overall Percentage", "Division");
        System.out.println();
        System.out.printf("%10d\t%18s\t%8.2f\t%10.2f\t%25s\t", rollNumber, nameOfTheStudent, averageCPI, percentageGot, passingDivision);

    }
}
