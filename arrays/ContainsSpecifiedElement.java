package arrays;

import java.util.*;

public class ContainsSpecifiedElement {

	public static void main(String[] args) {
		int[] nums = { 12,12,23,23,23};
		System.out.println("Original array: " + Arrays.toString(nums));
		int num1=12;
		int num2=23;
		System.out.println("Result: " +result(nums,num1,num2));

	}
	public static boolean result(int[] nums, int num1, int num2) {
		for(int no : nums) {
			boolean b = no != num1 && no != num2;
			if(b) {
				return false;
			}
	}
                return true;
}
}

