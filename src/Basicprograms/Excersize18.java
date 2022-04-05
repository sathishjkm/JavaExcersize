package Basicprograms;//Write a Java program to convert seconds to hour, minute and seconds
import java.util.*;
public class Excersize18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Seconds:");
        int seconds=scan.nextInt();
        int A1=seconds % 60;
        int A2=seconds / 60;
        int A3=A2 % 60;
        A2=A2 / 60;
        System.out.println(A2 + ":" + A3 + ":" + A1);
        System.out.println();
    }
}
