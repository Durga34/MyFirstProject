package string;

public class StringMethods {

	public static void main(String[] args) {
		String s1="hello";
		String s2="HELLO";
		String s3="hello";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.compareTo(s3));

	}

}
