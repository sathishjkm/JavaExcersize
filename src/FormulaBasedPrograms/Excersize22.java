package FormulaBasedPrograms;
// Calculate Batting Average
import java.util.*;
public class Excersize22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total matchs:");
        int totalMatch=scan.nextInt();
        System.out.println("Enter the total run:");
        int totalRun=scan.nextInt();
        System.out.println("Enter the innings:");
        int innings=scan.nextInt();
        System.out.println("Enter the notOut:");
        int notOut=scan.nextInt();
        double avg=totalRun/(innings-notOut);
        System.out.println("Batting Avarage is:"+ avg);
    }
}
