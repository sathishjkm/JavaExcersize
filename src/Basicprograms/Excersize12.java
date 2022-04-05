package Basicprograms;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string
public class Excersize12 {
    public static void main(String[] args) {
        String mail = "latchulatchu02@ gmail.com";
        count(mail);
    }
    public static void count(String a) {
        char[] ch = a.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherchar = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                otherchar++;
            }
        }
        System.out.println("Letter is:"+letter);
        System.out.println("Number is:"+num);
        System.out.println("Space is:"+space);
        System.out.println("OtherChar is:"+otherchar);
    }
}
