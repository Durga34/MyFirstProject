package arrays;

import java.util.Arrays;

public class DifferenceLargeSmall {

	public static void main(String[] args) {
		int[] arr = {5,7,2,4,9};
		System.out.println("Original array: " + Arrays.toString(arr));
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
        System.out.println("Difference between the largest and smallest value: " + (max-min));
	}

}
