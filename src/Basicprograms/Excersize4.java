package Basicprograms;//Take two numbers use sum,substraction,multiply,divide,remainder
import java.util.*;
public class Excersize4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1=scan.nextInt();
        System.out.println("enter the 2st number");
        int num2=scan.nextInt();
        int sum=num1+num2;
        int substraction=num1-num2;
        int multiple=num1*num2;
        double divide=num1/num2;
        double remainder=num1%num2;
        System.out.println("sum of:"+sum);
        System.out.println("substraction of:"+substraction);
        System.out.println("multiple of:"+multiple);
        System.out.println("divide of:"+divide);
        System.out.println("remainder of:"+remainder);

    }
}
