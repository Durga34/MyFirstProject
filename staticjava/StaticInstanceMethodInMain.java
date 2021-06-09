package staticjava;

public class StaticInstanceMethodInMain {
	String name=" ";
	static int y=2;
	static int square(int y) {
		return y*y;
	}
    public void instance(String name) {
    	this.name=name;
    }


	public static void main(String[] args) {
		int result= StaticInstanceMethodInMain.square(y);
        System.out.println("square : " + result);
        StaticInstance ob = new StaticInstance();
        ob.instance("instancemethod");
        System.out.println(ob.name);
        

		
	}

}
