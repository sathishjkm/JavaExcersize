package FormulaBasedPrograms;
// find area of equilateral triangle
import java.util.*;
public class Excersize4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the triangle:");
        double a=scan.nextDouble();
        double area=Math.sqrt(3)/4*(a*a);
        System.out.println("Triangle area is:"+ area);
    }
}
