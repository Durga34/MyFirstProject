interface intA{
	void name();
}
interface intB extends intA{
	void name1();
}
class InterfaceInheritance implements intB{
	public void name() {
		System.out.println("JALA");
	}
	public void name1() {
		System.out.println("TECHNOLOGIES");
	}

	public static void main(String[] args) {
		InterfaceInheritance i=new InterfaceInheritance();
		i.name();
		i.name1();

	}

}
