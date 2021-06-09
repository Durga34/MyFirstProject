package thisAndSuper;
class B{
	ArgumentConstructor obj;
	B(ArgumentConstructor obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}
}
public class ArgumentConstructor {
	int data=10;
	ArgumentConstructor(){
		B b=new B(this);
		b.display();
	}

	public static void main(String[] args) {
		ArgumentConstructor a =new ArgumentConstructor();

	}

}
