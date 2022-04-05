package Listofallstringprograms;
//Write a Java program to concatenate two string
public class Excercise1 {
    public static void main(String[] args) {
        String First_name = "Sathish";
        String Last_name = "kumar";
        System.out.println("String 1: " + First_name);
        System.out.println("String 2: " + Last_name);
        // Concatenating the two strings together.
        String Full_name = First_name.concat(Last_name);
//        String Full_name=First_name+Last_name;
        System.out.println("The concatenated string: " + Full_name);
    }
}

