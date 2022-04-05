package Listofallconditionalprograms;
//number of week’s day (1-7) and print name of the day
import java.util.*;
public class Excercise5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the week num");
        int day=scan.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day==2){
            System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }
        else if (day==5){
            System.out.println("Friday");
        }
        else if (day==6){
            System.out.println("Saturday");
        }
        else if (day==7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Input wrong number, please input(1-7)");
        }
    }
}
