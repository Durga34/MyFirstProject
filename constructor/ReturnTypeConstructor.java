package constructor;
class ReturnTypeConstructor{
int id;
String name;

ReturnTypeConstructor()
{
	System.out.println("default constructor");
}
ReturnTypeConstructor(int i){
	id=i;
}
ReturnTypeConstructor(String n){
	name=n;
}
void display() {
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	ReturnTypeConstructor s1=new ReturnTypeConstructor(14);
	ReturnTypeConstructor s2=new ReturnTypeConstructor("java");
	s1.display();
	s2.display();

}

}


