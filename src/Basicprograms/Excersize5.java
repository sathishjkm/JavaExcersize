package Basicprograms;//Take five numbers input then calculate and print average number
import java.util.*;
public class Excersize5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = scan.nextInt();
        int sum = 0, a;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number " + i + " : ");
            a = scan.nextInt();
            sum += a;
        }
        int avg = sum / n;
        System.out.println("sum of the value :" + sum);
        System.out.println("avg of the value :" + avg);
    }
}
