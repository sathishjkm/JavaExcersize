package Listofallconditionalprograms;
//Write a Java program that determines a student’s grade
import java.util.*;
public class Excercise16 {
    public static void main(String[] args) {
        showGrade();
    }
    static void showGrade(){
        float Theory_marks, Practical_marks,quiz_mark,avg;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter you Theory_mark:");
        Theory_marks=scan.nextFloat();
        System.out.print("Enter your Practical_mark:");
        Practical_marks=scan.nextFloat();
        System.out.print("Enter your quiz_mark:");
        quiz_mark=scan.nextFloat();
        avg=(Theory_marks+Practical_marks+quiz_mark)/3;
        if(avg>=90) {
            System.out.println("Your grade A.");
        }
        else if((avg>=70) && (avg<90)){
            System.out.println("Your grade B.");
        }
        else if((avg>=50) && (avg<70)){
            System.out.println("Your grade C.");
        }
        else if(avg<50) {
            System.out.println("Your grade F.");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

