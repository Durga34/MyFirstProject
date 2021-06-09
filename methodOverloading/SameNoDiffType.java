package methodOverloading;
class Adder4{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a*b;
	}
}

public class SameNoDiffType {

	public static void main(String[] args) {
		System.out.println(Adder4.add(2,4));
		System.out.println(Adder4.add(2.0, 4.0));

	}

}

