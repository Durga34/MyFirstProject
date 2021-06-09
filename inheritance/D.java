package inheritance;

class A {
	 void mom() {
		System.out.println("mom");
}

	void dad() {
		System.out.println("dad");
	}
	void human() {
		System.out.println("human");
	}
}
class B extends A{
	void son() {
		System.out.println("son");
		
	}
	void daughter() {
		System.out.println("daughter");
	}
	void human() {
		System.out.println("human");
		
	}
}
class C extends B{
    void grandson() {
		System.out.println("grand son");
	}
	void granddaughter() {
		System.out.println("grand daughter");
	}
	void human() {
		System.out.println("human");
	}
}

 class D{

	public static void main(String[] args) {
		C o1=new C();
		o1.mom();
		o1.dad();
		o1.son();
		o1.daughter();
		o1.grandson();
		o1.granddaughter();
		o1.human();


	}
}


