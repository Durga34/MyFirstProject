 interface Interface1{
	public String h="hello";
	public void sayHello();
}
public class UseInterfaceInstance implements Interface1 {
	public void sayHello() {
		System.out.println(Interface1.h);
	}

	public static void main(String[] args) {
		Interface1 interface1=new UseInterfaceInstance();
		interface1.sayHello();

	}

}
