package FormulaBasedPrograms;
//find area of rhombus(sevvagam)
import java.util.*;
public class Excersize5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the diognal1:");
        double d1=scan.nextDouble();
        System.out.println("Enter the diognal2:");
        double d2=scan.nextDouble();
        double area=(d1*d2)/2;
        System.out.println("Rhombus area is:"+ area);
    }
}
