package methodOverloading;

class Adder3{
	static int add(int a, int b) {
		return a+b;
	}
	static int add1(int a, int b) {
		return a*b;
	}
}

public class SameNoSameType {

	public static void main(String[] args) {
		System.out.println(Adder3.add(2,4));
		System.out.println(Adder3.add1(2, 4));

	}

}

