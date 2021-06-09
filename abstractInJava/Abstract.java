package abstractInJava;

abstract class Book {
abstract void run();
}
class Abstract extends Book{
	void run() {
		System.out.println("running safely");
	}
	public static void main(String[] args) {
		Book obj = new Abstract();
		obj.run();
	}
}