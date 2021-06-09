package constructor;

public class MultipleConstructor {
	MultipleConstructor(){
		System.out.println("constructor1");
	}
	MultipleConstructor(int a){
		System.out.println("constructor2");
	}
	MultipleConstructor(String s){
		System.out.println("constructor3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleConstructor obj=new MultipleConstructor();

	}

}
