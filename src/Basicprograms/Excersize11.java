package Basicprograms;//Compare two numbers
import java.util.*;
public class Excersize11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1=scan.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scan.nextInt();
        if (num1==num2) {
            System.out.println("num1 equal to equal num2");
        }
        if (num1<num2){
            System.out.println("num1 less than num2");
        }
        if (num1>num2) {
            System.out.println("num1 greater then nun2");
        }
        if (num1<=num2){
            System.out.println("num1 less then or equal to num2");
        }
        if (num1>=num2){
            System.out.println("num1 greater then or equal to num2");
        }
        if (num1!=num2){
            System.out.println("num1 not equal to num2");
        }
    }
}
