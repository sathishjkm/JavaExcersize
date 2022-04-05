package Listofallconditionalprograms;
// display the multiplication table of a given integer
import java.util.*;
public class Excercise11 {
    public static void main(String[] args) {
        int j,num;
            System.out.print("Enter number of terms : ");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            System.out.println ("\n");
            for(j=0;j<=num;j++) {
                System.out.println(num+" X "+j+" = " +num*j);
            }
        }
    }




