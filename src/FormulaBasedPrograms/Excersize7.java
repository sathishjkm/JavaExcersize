package FormulaBasedPrograms;
// find volume of Prism(muppadai kannadi)
import java.util.*;
public class Excersize7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the base:");
        double base=scan.nextDouble();
        System.out.println("Enter the height:");
        double height=scan.nextDouble();
        double volume=base*height;
        System.out.println("volume of prism is:"+ volume);
    }
}
