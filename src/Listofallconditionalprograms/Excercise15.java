package Listofallconditionalprograms;
// accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order.
import java.util.*;
public class Excercise15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Input third number: ");
        double num3 = scan.nextDouble();
        if (num1 < num2 && num2 < num3) {
            System.out.println("Numbers are in Increasing order");
        }
        else if (num1 > num2 && num2 > num3) {
            System.out.println("Numbers are in Decreasing order");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

