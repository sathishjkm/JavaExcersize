package Basicprograms;//convert decimal number to binary number
import java.util.Scanner;
public class Excersize7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int a=scan.nextInt();
        System.out.println("The binary no is:");
        System.out.println(Integer.toBinaryString(a));

    }
}
