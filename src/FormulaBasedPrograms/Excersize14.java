package FormulaBasedPrograms;
// find surface area of cube
import java.util.*;
public class Excersize14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the side of cube:");
        double side=scan.nextDouble();
        double surface=4*side*side;
        System.out.println("Surface area of cube is:"+ surface);
    }
}
