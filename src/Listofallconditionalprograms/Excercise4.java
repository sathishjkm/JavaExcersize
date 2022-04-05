package Listofallconditionalprograms;
//takes a year from user and print whether that year is a leap year or not
import java.util.*;
public class Excercise4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scan.nextInt();
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        if (a && (b || c)){
            System.out.println("is a leap year");
        }
        else{
            System.out.println("is not a leap year");
        }
    }
}
