interface MyInterface{
	public void method1();
	public void method2();
}
public class InterfaceWithTwoMethod implements MyInterface {
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}

	public static void main(String[] args) {
		MyInterface obj=new InterfaceWithTwoMethod();
		obj.method1();

	}

}
