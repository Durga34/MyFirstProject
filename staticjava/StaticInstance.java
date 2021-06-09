package staticjava;
public class StaticInstance {
	String name = " ";
	int age = 12;
	static int x = 5;
	static int y = 2;
	static int cube(int x) {
		return x*x*x;
	}
	static int square(int y) {
		return y*y;
	}
    public void instance(String name) {
    	this.name=name;
    }
    public void instance1(int age) {
    	this.age=age;
    }
	public static void main(String[] args) {
		int result1=StaticInstance.cube(x);
		System.out.println("cube : " + result1);
        int result2=StaticInstance.square(y);
        System.out.println("square : " + result2);
        StaticInstance ob = new StaticInstance();
        ob.instance("instancemethod");
        System.out.println(ob.name);
        ob.instance("age");
        System.out.println(ob.age);
        	}

}
