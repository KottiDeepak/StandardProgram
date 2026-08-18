package classObject;

public class DemoOfClassObject {
	public static void main(String[] args) {
		student s1=new student();
		s1.name ="Abhi";
		s1.age=12;
		s1.School ="ABC SCHOOL";
		s1.city = "hyderabad";
		
		student s2=new student();
		s2.name ="Ramya";
		s2.age=12;
		s2.School ="ABC SCHOOL";
		s2.city = "hyderabad";
		
		student s3=new student();
		s3.name ="Shekhar";
		s3.age=14;
		s3.School ="ABC SCHOOL";
		s3.city = "hyderabad";
		System.out.println("Student 1 details");
		s1.display();
		System.out.println("\nStudent 2 details");
		s2.display();
		System.out.println("\nStudent 3 details");
		s3.display();

	}
}
class student 
{
	public String name;
	public int age;
	public static String School="ABC";
	public static  String city = "hyderabad";
	public void display()
	{
		
	System.out.println("Name:   "+name);
	System.out.println("Age:    "+age);
	System.out.println("School: "+School);
	System.out.println("City:   "+city);
		
	}
}

