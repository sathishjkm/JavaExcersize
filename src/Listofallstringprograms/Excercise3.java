package Listofallstringprograms;

import java.util.Locale;

//Write a Java program to convert all characters in a string to uppercase
public class Excercise3 {
    public static void main(String[] args) {
        String city = "MY native place Is Papanasam";
        // Convert the above string to all uppercase.
        String upperCase= city.toUpperCase();
        // Display the two strings for comparison.
        System.out.println("Original String: " + city);
        System.out.println("String in lowercase: " + upperCase);
    }
}

