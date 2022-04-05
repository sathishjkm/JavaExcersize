package FormulaBasedPrograms;
//find surface area of cylinder
import java.util.*;
public class Excersize13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius");
        double r=scan.nextDouble();
        System.out.println("Enter the height");
        double h=scan.nextDouble();
        double area=((2*22*r)/7*(r+h));
        System.out.println("Surface area of cylinder is:"+ area);
    }
}
