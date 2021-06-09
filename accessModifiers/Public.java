package accessModifiers;

public class Public {
	public static int i=10;
	public void disp() {
		System.out.println("public");
	}

	public static void main(String[] args) {
		Public obj=new Public();
		System.out.println("output:" + obj.i);
		obj.disp();
		
		

	}

}
