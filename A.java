 interface print {
	void printInterface();
}
class A implements print{
	public void printInterface() {
		System.out.println("interface");
	}
	public static void main(String[] args) {
		A obj = new A();
		obj.printInterface();
	}

}

