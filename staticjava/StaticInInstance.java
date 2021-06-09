package staticjava;

public class StaticInInstance {
	static int a;
	public void display() {
	a=10;
	}
	public static void main(String[] args) {
		StaticInInstance s = new StaticInInstance();
       s.display();
       System.out.println(a);
	}

}
