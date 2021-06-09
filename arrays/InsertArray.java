package arrays;
import java.util.*;
public class InsertArray {

	public static void main(String[] args) {
		int n,pos,x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements you want:");
		n=s.nextInt();
		int a[] = new int[n+1];
		System.out.println("Enter all the elements:");
		for(int i=0; i<n; i++) {
			a[i]=s.nextInt();
		}
        System.out.println("Enter the position ");
        pos=s.nextInt();
        System.out.println("Enter the element");
        x=s.nextInt();
        for(int i=(n-1); i>=(pos-1); i--) {
        	a[i+1]=a[i];
        }
        a[pos-1]=x;
        System.out.println("After inserting:");
        for(int i=0; i<n; i++)
        {
        	System.out.println(a[i]);
        }
        System.out.println(a[n]);
	}

}
