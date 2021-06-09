package thisAndSuper;
class Animal{
	String color="pink";
}
class Dog extends Animal{
	String color="red";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class UsingSuper {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.printColor();

	}

}
