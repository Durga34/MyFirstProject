package arrays;
public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = {10,20,30,30,40,40,50};
		int count;
		for (int i = 0; i<arr.length; i++) {
		      count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==(arr[j])){
					
				count=count+1;
				arr[j]=0;
				}
				
			
			}
			if(count>=1 && arr[i]!=0){
				System.out.println(arr[i]);
			}
			
		}


	}

}
