package Basicprograms;

//Compute Sum of digits
public class Excersize10 {
    public static void main(String args[]){
        int number,digit,sum;
        number=786;
        sum=0;
        while (number>0){//(786>0);(78>0);(7>0);
            digit=number%10;//786%10=6;78%10=8;7%10=7;
            sum=sum+digit;//0+6=6;6+8=14;14+7=21;
            number=number/10;//786/10=78;78/10=7;7/10=0;(end of while loop)
        }
        System.out.println("digit number is:"+sum);
    }
}
