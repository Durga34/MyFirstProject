package arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = {25,14,32,56,73};
		System.out.println("Original array : " + Arrays.toString(arr));
		int remInd = 1;
		for(int i=remInd; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
        System.out.println("After removing the element: " + Arrays.toString(arr));
	}

}
