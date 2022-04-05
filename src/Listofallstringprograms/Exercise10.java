package Listofallstringprograms;
//Write a java program to remove a particular character from a string
public class Exercise10 {
    public static void main(String[] args) {
        String str = "TechStudy.org";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
        }
    }



