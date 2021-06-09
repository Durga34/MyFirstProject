package exceptions;

public class ExceptionWithOwnMessage {
	static void validate(int age){
		if(age<18)
			throw new ArithmeticException("arithmetic");
		else
			System.out.println("Welcome");
	}

	public static void main(String[] args) {
		validate(15);
		System.out.println("rest of the code..");

	}

}
