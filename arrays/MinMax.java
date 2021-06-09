package arrays;
import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		int nums[] = {-3,-5,0,1,4};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);
		

	}

}
