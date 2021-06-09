package thisAndSuper;
class A{
	A(){
		System.out.println("constructor");
	}
	A(int x){
		this();
		System.out.println(x);
	}
}
public class CallConstructorUsingThis {

	public static void main(String[] args) {
		A a=new A(10);
		

	}

}
