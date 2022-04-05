package Basicprograms;//Write a Java program to count the number of even and odd elements in a given array
import java.util.*;
public class Excersize20 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15};
        int even = 0, odd = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2== 0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("Even number is:"+ even);
        System.out.println("Odd number is:"+ odd);
    }
}

