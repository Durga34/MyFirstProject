package arrays;
import java.util.*;
public class AddInteger {
	public static int[] addX(int n, int arr[], int x) {
		int i;
		int newarr[] = new int[n+1];
		for(i=0; i<n; i++)
			newarr[i]=arr[i];
		newarr[n]=x;
		return newarr;
	}

	public static void main(String[] args) {
		int n=5;
		int i;
		int arr[]= {1,2,3,4,5};
		System.out.println("Initial array: " + Arrays.toString(arr));
		int x = 10;
		arr = addX(n,arr,x);
		System.out.println("Array with " + x + " added : " + Arrays.toString(arr));

	}

}
