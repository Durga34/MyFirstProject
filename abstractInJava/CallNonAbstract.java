package abstractInJava;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("circle");
	}
}
class CallNonAbstract{
	public static void main(String[] args) {
		
	
Shape t = new Circle();
		t.draw();
	}
}

