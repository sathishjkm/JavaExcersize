package FormulaBasedPrograms;
//find Volume Of cuboid(gana sathuram)
import java.util.*;
public class Excersize10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length:");
        double length=scan.nextDouble();
        System.out.println("Enter the width:");
        double width=scan.nextDouble();
        System.out.println("Enter the height:");
        double height=scan.nextDouble();
        double volume=(length*width*height);
        System.out.println("Volume of cuboid is:"+ volume);
    }
}
