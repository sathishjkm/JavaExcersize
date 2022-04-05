package Listofallconditionalprograms;
// display the cube of the number upto given an integer
import java.util.*;
public class Excercise9 {
    public static void main(String[] args) {
        int i, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Cube of" + i + "is:" + i * i * i);
        }
    }
}
