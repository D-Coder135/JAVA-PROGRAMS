import java.util.Scanner;

class Datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number to be checked:");
        num = sc.nextInt();
        if ((num >= Byte.MIN_VALUE) && (num <= Byte.MAX_VALUE))
            System.out.println("Can be held In Byte Datatype");
        if ((num >= Character.MIN_VALUE) && (num <= Character.MAX_VALUE))
            System.out.println("Can be held in char datatype");
        if ((num >= Short.MIN_VALUE) && (num <= Short.MAX_VALUE))
            System.out.println("Can be held in short datatype");
        if ((num >= Long.MIN_VALUE) && (num <= Long.MAX_VALUE))
            System.out.println("Can be held in Long datatype");
        if ((num >= Float.MIN_VALUE) && (num <= Float.MAX_VALUE))
            System.out.println("Can be held in float datatype");
        if ((num >= Double.MIN_VALUE) && (num <= Double.MAX_VALUE))
            System.out.println("Can be held in double datatype");
    }
}


