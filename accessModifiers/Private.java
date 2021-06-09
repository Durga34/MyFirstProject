package accessModifiers;

public class Private {
	private String s="private field";
	private void msg() {
		System.out.println("private method");
	}

	public static void main(String[] args) {
		Private a=new Private();
		System.out.println(a.s);
		a.msg();

	}

}
