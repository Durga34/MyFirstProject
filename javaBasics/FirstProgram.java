package javaBasics;

public class FirstProgram {
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public static void main(String args[]) {
		FirstProgram obj = new FirstProgram();
		int result = obj.add(2, 4);
		System.out.println(result);
	}

}
