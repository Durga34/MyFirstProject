package arrays;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		int n,sum=0;
		float avg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
System.out.println("sum: " + sum);
avg = sum/n;
System.out.println("average: " + avg);
	}

}
