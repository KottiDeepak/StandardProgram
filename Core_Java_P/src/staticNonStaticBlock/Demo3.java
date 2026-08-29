package staticNonStaticBlock;


public class Demo3 {
	public static void main(String[] args) {
		 A ob1=new A(10,20);
		 A ob2=new A(ob1);
		 System.out.println(ob2.k+"================="+ob2.j);
	}
	
} 
class A{
	public int k;
	public int j;
	
	public A(int k, int j) {
		super();
		this.k = k;
		this.j = j;
	}
	public A(A ob) {
		this.k=ob.k;
		this.j=ob.j;
	}
}
