package FormulaBasedPrograms;
//Calculate Power Of Number
public class Excersize25 {
    public static void main(String[] args) {
        int base = 8, exponent = 3;
        long result = 1;
        while (exponent!=0){//
            result*=base;
            --exponent;
        }
        System.out.println("Power of Number is:"+ result);
    }
}
