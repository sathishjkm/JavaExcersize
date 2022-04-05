package FormulaBasedPrograms;
//Java Program to find area of circle
import java.util.*;
public class Excersize1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the circle:");
        double radius=scan.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle is:"+ area);
    }
}
