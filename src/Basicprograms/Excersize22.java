package Basicprograms;//Write a Java program to add two numbers without using any arithmetic operators
import java.util.*;
public class Excersize22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The 1st Number:");
        int A=scan.nextInt();
        System.out.println("Enter The 2nd Number:");
        int B=scan.nextInt();
        System.out.println(Math.addExact(A,B));
    }
}
