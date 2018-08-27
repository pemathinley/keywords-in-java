final class end{
	private String str="this class cannot be extended further.";
	void display(){
		System.out.println(str);
	}
}
public class last {
	public static void main(String[] args) {
	end sc=new end();
	sc.display();
	}
}