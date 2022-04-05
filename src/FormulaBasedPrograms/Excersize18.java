package FormulaBasedPrograms;
// find factorial of number
public class Excersize18 {
    public static void main(String[] args) {
        int n=6,fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;//fact=fact*i
        }
        System.out.println("Factorial no is:"+ fact);
    }
}
