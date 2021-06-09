package methodOverloading;
class Adder1{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}

public class DiffTypeArgument {

	public static void main(String[] args) {
		System.out.println(Adder1.add(2,4));
		System.out.println(Adder1.add(2.5, 3.5));

	}

}
