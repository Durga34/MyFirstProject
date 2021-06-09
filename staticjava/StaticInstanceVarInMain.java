package staticjava;

public class StaticInstanceVarInMain {
	int i=10;
	static int j=20;
	
	public static void main(String[] args) {
		StaticInstanceVarInMain val=new StaticInstanceVarInMain();
		int res=val.i;
		System.out.println(res);
		System.out.println(j);

	}

}
