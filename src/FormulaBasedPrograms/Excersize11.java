package FormulaBasedPrograms;
//find volume of cone(koombu)
import java.util.*;
public class Excersize11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius=scan.nextDouble();
        System.out.println("Enter the height:");
        double height=scan.nextDouble();
        double volume=(22*radius*radius*height)/(7*3);
        System.out.println("Volume of Cone is:"+ volume);
    }
}
