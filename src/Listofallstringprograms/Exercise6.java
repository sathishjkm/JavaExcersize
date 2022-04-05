package Listofallstringprograms;
//Write a Java program to replace all the ‘d’ characters with ‘f’ characters
public class Exercise6 {
    public static void main(String[] args) {
        String str = "My native place is-PAPANASAM";
        // Replace all the 'a' characters with 'f' characters.
        String new_str = str.replace('A', 'F');
        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}

