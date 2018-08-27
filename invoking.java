 class base{
	 private int x;
	 private int y;
	 int sum(int a,int b){
		 x=a;
		 y=b;
		 return x+y;
	 }
}
 class top extends base{
	 void getSum(int x,int y){
		 System.out.println(sum(x,y));
	 }
 }
public class invoking{
	public static void main(String[] args) {
	
	top t=new top();
	t.getSum(2,5);
	
}
}