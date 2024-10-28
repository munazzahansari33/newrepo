package pkg3.no.sum;
import java.util.Scanner;

public class NoSum {
    public static void main(String[] args) {
        System.out.println("Sum of three number");
        Scanner in = new Scanner (System.in);
        System.out.print("Enter 1st number:");
        int no1 = in.nextInt();
        System.out.print("Enter 2nd number:");
        int no2 = in.nextInt();
        System.out.print("Enter 3rd number:");
        int no3 = in.nextInt();
        int sum = no1 + no2 + no3;
        System.out.print("The Sum is:");
        System.out.println(sum);
    }
    
}
