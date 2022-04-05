package FormulaBasedPrograms;
//find area of rectangle
import java.util.*;
public class Excersize2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length:");
        double length=scan.nextDouble();
        System.out.println("Enter the breadth:");
        double breadth=scan.nextDouble();
        double area=length*breadth;
        System.out.println("Rectangle area is:"+ area);
    }
}
