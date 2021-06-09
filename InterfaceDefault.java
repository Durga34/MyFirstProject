interface Default1{
	void default2();
	default void msg() {
		System.out.println("default method");
	}
}
class DefaultInterface implements Default1{
	public void default2() {
		System.out.println("default interface");
	}
}
class InterfaceDefault{
	public static void main(String[] args) {
		Default1 d=new DefaultInterface();
		d.default2();
		d.msg();

	}

}
