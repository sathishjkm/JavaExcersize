package Listofallconditionalprograms;
//reads an integer and check whether it is negative, zero, or positive
import java.util.*;
public class Excercise12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        }
        else if (num < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}


