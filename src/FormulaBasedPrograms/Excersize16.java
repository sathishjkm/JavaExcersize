package FormulaBasedPrograms;
// check vowel or consonant
import java.util.*;
public class Excersize16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the char:");
        char chr=scan.next().charAt(0);
        if (chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'){
            System.out.println("This char is vowel");
        }
        else if (chr>='a'&&chr<='z'||chr>='A'&&chr<='Z'){
            System.out.println("This char is consonant");
        }
        else
            System.out.println("This char is Not a Alphabet");
        }
    }

