package constructor;

class Test{
	private Test() {
		System.out.println("private");
	}
	protected Test(int x) {
		System.out.println(x);
	}
}
public class AccessModifierInConstructor extends Test{
	public AccessModifierInConstructor() {
		super(100);
	}
	public static void main(String[] args) {
		AccessModifierInConstructor d=new AccessModifierInConstructor();
	}
}