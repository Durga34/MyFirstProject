package accessModifiers;

public  class Default {
	 int i=10 ;
	 void msg() {
			System.out.println("default method");
	 }
	
     public static void main(String[] args) {
			Default d=new Default();
			System.out.println("Output:" +d.i);			
			d.msg();
		}

		}



