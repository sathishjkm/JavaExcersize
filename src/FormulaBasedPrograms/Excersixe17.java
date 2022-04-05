package FormulaBasedPrograms;
//sum of N numbers
import java.util.*;
public class Excersixe17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many no of sum");
        int num=scan.nextInt();
        int sum=0,a;
        for (int i=0;i<num;i++){
            System.out.println("Enter the no:"+(i+1));
            a=scan.nextInt();
            sum+=a;
        }
        System.out.println("The result of sum:"+ sum);
    }
}
