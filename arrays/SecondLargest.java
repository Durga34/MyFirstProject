package arrays;

import java.util.Arrays;

public class SecondLargest {
	public static int getSecondLargest(int[]a, int total) {
		Arrays.sort(a);
		return a[total-2];
	}

	public static void main(String[] args) {
		int a[] = {1,5,2,4,7,3};
		System.out.println("Second largest : " + getSecondLargest(a,6));

	}

}
