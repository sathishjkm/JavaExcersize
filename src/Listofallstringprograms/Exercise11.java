package Listofallstringprograms;
//Write a java program to reverse a String
public class Exercise11 {
    public static void main(String[] args) {
        String string = "techstudy";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("String before reverse: "+string);
        System.out.println("String after reverse: "+reverse);
    }
}


