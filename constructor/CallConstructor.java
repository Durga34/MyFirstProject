package constructor;
class CallConstructor{
	int id;
	String name;
	public CallConstructor(String s) {
		name=s;
	}
	public CallConstructor(int i)
	{
		id=i;
	}
	void display() {
		System.out.println(id + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallConstructor obj=new CallConstructor("constructor");
		CallConstructor obj1=new CallConstructor(10);
		obj.display();
		obj1.display();
	}

}
