package operators;
import java.util.*;
public class SmallLarge {

	public static void main(String[] args) {
		int arr[] = { 50,20,30,10,40};
		Arrays.sort(arr);
		System.out.println("Smallest element: " + arr[0]);
		System.out.println("Largest element: " + arr[4]);

	}

}
