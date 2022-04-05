package Basicprograms;//Write a Java program to swap the first and last elements of an array and create a new array
import java.util.*;
public class Excersize19 {
    public static void main(String[] args) {
        int [] array_nums={10,20,30,40};
        System.out.println(Arrays.toString(array_nums));
        int x=array_nums[0];
        array_nums[0]=array_nums[array_nums.length-1];
        array_nums[array_nums.length-1]=x;
        System.out.println(Arrays.toString(array_nums));
        int num1=10;
        int num2=20;
        int num3=30;
        System.out.println(num1+":"+num2+":"+num3);
        int temp;
        temp=num1;
        num1=num3;
        num3=temp;
        System.out.println(num1+":"+num2+":"+num3);
    }
}
