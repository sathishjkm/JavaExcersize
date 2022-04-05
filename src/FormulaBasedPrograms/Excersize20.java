package FormulaBasedPrograms;
// Calculate CGPA Percentage
public class Excersize20 {
    public static void main(String[] args) {
        int num = 5;
        double mark[] = new double[num];
        double per[] = new double[num];
        double sum = 0, cgpa;
        mark[0] = 95;
        mark[1] = 85;
        mark[2] = 75;
        mark[3] = 65;
        mark[4] = 55;
        for (int i = 0; i < num; i++) {
            per[i] = (mark[i] / 10);//(95/10=9.5);(85/10=8.5);(75/10=7.5);(65/10=6.5);(55/10=5.5)
        }
        for (int i=0;i<num;i++){
            sum+=per[i];//(0+9.5=9.5);(9.5+8.5=18);(18+7.5=25.5);(25.5+6.5=32);(32+5.5=37.5)
        }
        cgpa=sum/num;//(37.5/5=7.5)
        System.out.println("CGPA is:"+ cgpa);
        System.out.println("CGPA percentage is:"+ (9.5*cgpa));//(9.5*7.5=71.25)
    }
}
