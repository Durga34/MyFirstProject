package thisAndSuper;

public class Account {
	int a;
	int b;
	Account(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println("a= " + a + " b= " + b);
	}

	public static void main(String[] args) {
	    Account obj=new Account(10,20);
	    obj.display();

	}

}
