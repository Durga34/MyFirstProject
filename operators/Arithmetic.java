package operators;

public class Arithmetic {
	public static void Addition() {
		int num1 = 2, num2 = 4;
		int sum = num1 + num2;
		System.out.println("sum is: " + sum);}
    public static void Subtraction() {	
    	int num1 = 3, num2 = 6;
		int dif = num1 - num2;
		System.out.println("Difference is: " + dif);}
    public static void Multiplication() {
    	int num1 = 4, num2 = 4;
		int mul = num1 * num2;
		System.out.println("Multiplied value is: " + mul);}
    public static void Division() {
    	int num1 = 8, num2 = 4;
		int div = num1 / num2;
		System.out.println("Quotient is: " + div);}
				
	public static void main(String[] args) {
		Addition();
		Subtraction();
		Multiplication();
		Division();
		
	}

}
