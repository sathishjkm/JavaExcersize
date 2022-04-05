package Listofallconditionalprograms;
//input 5 numbers from keyboard and find their sum and average
import java.util.*;
public class Excercise6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,sum=0,number=0;
        double avg;
        System.out.println("Enter the any 5 numbers");
        for (i=0;i<5;i++) {
            number = scan.nextInt();
            sum += number;
        }
        avg=sum/5;
        System.out.println("Sum of 5 no is:"+ sum+"\n Average is:"+ avg);
    }
}
