
public class Student001 {
	public static void main(String [] args) {
		Student03 s1=Student03.giveMeAnObject(10,20);
		System.out.println(s1);
		Student03 s2=Student03.giveMeAnObject(30,40);
		System.out.println(s2);
		Student03 s3=Student03.giveMeAnObject(50,60);
		System.out.println(s3);
	}
}
class Student03 
{
	private int i;
	private int j;
	private static Student03 singleObject=null;
	public static Student03 giveMeAnObject(int i,int j)
	{
		if(singleObject==null)
		{
			singleObject=new Student03(i,j);
		}
		return singleObject;
	}
	private Student03(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "Student [i=" + i + ", j=" + j + "]";
	}
	
}
