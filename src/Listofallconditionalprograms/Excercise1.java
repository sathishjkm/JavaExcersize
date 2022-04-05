package Listofallconditionalprograms;
//take three numbers from the user and print the greatest number
import java.util.*;
public class Excercise1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st num:");
        int num1=scan.nextInt();
        System.out.println("Enter the 2nd num:");
        int num2=scan.nextInt();
        System.out.println("Enter the 3rd num:");
        int num3=scan.nextInt();
        if (num1>num2&&num1>num3){
            System.out.println("Greatest num is:"+ num1);
        }
        if (num2>num1&&num2>num3){
            System.out.println("Greatest num is:"+ num2);
        }
        if (num3>num1&&num3>num2){
            System.out.println("Greatest num is:"+ num3);
        }
    }
}
