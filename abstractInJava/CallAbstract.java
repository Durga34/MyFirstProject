package abstractInJava;

abstract class New {
	abstract void read();
}
class CallAbstract extends New{
	

	void read() {
		System.out.println("read slowly");
	}
	public static void main(String[] args) {
		New obj1 = new CallAbstract();
		obj1.read();
	}
}
