package constructor;

public class CreateConstructor {
	int id;
	String name;
	int age;
	CreateConstructor()
	{
		System.out.println("default constructor");
	}
	CreateConstructor(int i){
		id=i;
	}
	CreateConstructor(String n,int a){
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		CreateConstructor s1=new CreateConstructor(14);
		CreateConstructor s2=new CreateConstructor("java",4);
		s1.display();
		s2.display();

	}

}
