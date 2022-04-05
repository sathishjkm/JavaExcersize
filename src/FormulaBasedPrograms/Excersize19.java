package FormulaBasedPrograms;
//calculate electricity bill
import java.util.*;
public class Excersize19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the unit");
        int units=scan.nextInt();
        double billpay=0;
        if (units<100){
            billpay=100*1.20;
        }
        else if (units<300){
            billpay=100*1.20+(units-100)*2;
        }
        else if (units>300){
            billpay=100*1.20+200*2+(units-300)*3;
        }
        System.out.println("Electricity bill is:"+ billpay);
    }
}
