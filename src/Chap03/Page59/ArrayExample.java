package chapter3.Chap03.Page59;

import java.util.Arrays; // ✅ Import Arrays class

public class ArrayExample {
    public static void main(String[] args) {
        int[] nums;               // Step 1: Declare the array variable
        nums = new int[7];        // Step 2: Create array with length 7

        // Step 3: Assign values
        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;

        // Print each element with its index
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element at index " + i + " is " + nums[i]);
        }

        // Print a specific element
        System.out.println("Element at index 2 is: " + nums[2]);

        // Print the entire array
        System.out.println("Full array: " + Arrays.toString(nums));
    }
}