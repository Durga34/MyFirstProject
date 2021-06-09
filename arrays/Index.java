package arrays;

public class Index {

	public static void main(String[] args) {
		int a[] = {4,8,14,35,55};
		int element = 14;
		int index = 0;
		int i = 0;
		while(i<a.length) {
			if(a[i]==element) {
				index = i;
				break;
			}
			i++;
		}
         System.out.println("Index of " +element+ " is : " + index);
	}

}
