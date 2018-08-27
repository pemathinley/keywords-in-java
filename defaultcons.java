class demo{
	private int x;
	private int y;
	demo(){
		x=6;
	}
	demo(int i){
		this();
		y=i;
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class defaultcons {
	public static void main(String[] args) {
	demo t=new demo(9);
	
}
}