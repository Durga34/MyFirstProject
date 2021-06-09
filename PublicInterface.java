 interface Actionable{
	public static boolean isActionable=false;
	public void performAction();
}
public class PublicInterface implements Actionable{
public void performAction() {
	if(isActionable) {
}
}
}


