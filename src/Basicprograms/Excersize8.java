package Basicprograms;//Convert Binary number to Decimal number
import java.util.*;
public class Excersize8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String a = scan.nextLine();
        System.out.print("The decimal number is: ");
        System.out.print(Integer.parseInt(a,2));
    }
}