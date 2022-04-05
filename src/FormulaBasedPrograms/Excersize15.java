package FormulaBasedPrograms;
//calculate average marks
import java.util.*;
public class Excersize15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the  no of subject:");
        int subject=scan.nextInt();
        int sum=0,a;
        for (int i=1;i<=subject;i++){
            System.out.println("Enter the mark:"+i);
            a=scan.nextInt();
            sum+=a;//sum=sum+a
        }
        double avg=sum/subject;
        System.out.println("Total marks is:"+ sum);
        System.out.println("Average is:"+ avg);
    }
}
