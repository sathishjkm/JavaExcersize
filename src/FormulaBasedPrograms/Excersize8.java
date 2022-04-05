package FormulaBasedPrograms;
//find volume of sphere(kolam)(mandalam)
import java.util.*;
public class Excersize8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius=scan.nextDouble();
        double volume=(4*22*radius*radius*radius)/(3*7);
        System.out.println("Volume of sqhere is:"+ volume);
    }
}
