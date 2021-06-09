package staticjava;

public class StaticMethodInInstance {
	static int add()
	{
		int x=10,y=20;
		int z=x+y;
		return z;
	}
	void disp()
	{
		int a = add();
		System.out.println("Addition = " +a);
	}
	public static void main(String[] args) {
		
		StaticMethodInInstance i = new StaticMethodInInstance();
		i.disp();
	}

	

	

}
