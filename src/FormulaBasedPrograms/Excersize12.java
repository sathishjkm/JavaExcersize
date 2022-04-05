package FormulaBasedPrograms;
//find surface area of cuboid
import java.util.*;
public class Excersize12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        double l=scan.nextDouble();
        System.out.println("Enter the breadth");
        double b=scan.nextDouble();
        System.out.println("Enter the height");
        double h=scan.nextDouble();
        double area=(2*(l*b+b*h+h*l));
        System.out.println("Surface area of cuboid is:"+ area);

    }
}
