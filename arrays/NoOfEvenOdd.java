package arrays;
import java.util.*;
public class NoOfEvenOdd {

	public static void main(String[] args) {
		int[] arr = {5,7,2,4,9};
		System.out.println("Original array : " + Arrays.toString(arr));
		int c = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				c++;
		}
        System.out.println("No of even nos : " + c);
        System.out.println("No of odd nos : " + (arr.length-c));
	}

}
