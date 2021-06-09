public class TwoInterfaceWith1Method{
	interface gift{
		void present();
	}
	interface guest {
		void present();
	}
	interface presentable extends gift,guest{
		
	}
	public static void main(String[] args) {
		presentable mom = new presentable() {
			public void present(){
				System.out.println("hi mom");
			}
		};
		mom.present();
		
	}
}
	

	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	//}

