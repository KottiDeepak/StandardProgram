package classObject;

public class ConstructorChaining {
	public static void main(String args[])
	{
		Student2 s1=new Student2("Abhi",501,21,98.34);
		Student2 s2=new Student2("Sujit",505,20,64);
		s1.display();
		System.out.println("================================\n");
		s2.display();
	}
}
	class Student2
	{
		public String name;
		public int StudentId;
		public int age;
		public double percentage;
		public String city;
	public Student2(String name, int StudentId, int age, double percentage){
			this.name=name;
			this.StudentId=StudentId;
			this.age=age;
			this.percentage=percentage;
		}
	public Student2(String name, int StudentId, int age, double percentage,String city){
			this(name,StudentId,age,percentage);
			this.city=city;
		}
	public void display(){
		System.out.println("name : "+name);
		System.out.println("StudentId : "+StudentId);
		System.out.println("age : "+age);
		System.out.println("Percentage : "+percentage);
		System.out.println("city : "+city);
	}
}


