package Basicprograms;//Write a Java program to add all the digits of a given positive integer
import java.util.*;
public class Excersize23 {
    public static void main(String[] args) {
        int m,n,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number:");
        m=scan.nextInt();
        while (m > 0) {
            n=m%10;
            sum=sum+n;
            m=m/10;
        }
        System.out.println("Digit Number is:"+ sum);


    }
}
