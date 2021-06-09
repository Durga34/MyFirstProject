package thisAndSuper;
class Bird{
	Bird(){
		System.out.println("Bird is created");
	}
}
class Dove extends Bird{
	Dove(){
		super();
		System.out.println("dove is created");
	}
}
public class CallConstructorUsingSuper {

	public static void main(String[] args) {
		Dove d = new Dove();

	}

}
