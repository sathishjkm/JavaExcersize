package Listofallstringprograms;
//Write a Java program to trim a string(remove whitespaces)
public class Excercise4 {
    public static void main(String[] args) {
        String name = " SATHISHKUMAR ";
        // Trim the whitespace from the front and back of the String.
        String new_name = name.trim();
        // Display the strings for comparison.
        System.out.println("Original String: " + name);
        System.out.println("New String: " + new_name);
    }
}
