package loops;

public class Palindrome {

	public static void main(String[] args) {
		int no=121;
		int rev=0;
		int org=no;
		while(no!=0){
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(org==rev){
			System.out.println(org + " is a palindrome");
		}
		else{
			System.out.println(org + " is not a palindrome");
		}

	}

}
