package FormulaBasedPrograms;
//find area of parallelogram(inaigaram)
import java.util.*;
public class Excersize6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the height:");
        double h=scan.nextDouble();
        System.out.println("Enter the breadth:");
        double b=scan.nextDouble();
        double area=h*b;
        System.out.println("Parallelogram area is:"+ area);
    }
}
