package inheritancePrograms;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name, age and breed of the Dog: ");
		
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String bread=sc.nextLine();
		
		Dog d=new Dog(name,age,bread);
	d.displayDetails();
	d.eat();
	d.bark();
		
	}
}
class Animal {;
	public String name;
	public int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name : "+name );
		System.out.println("age : "+age);
	}
	public void eat()
	{
		System.out.println("eating food");
	}
}
class Dog extends Animal
{
	public String bread;
	public Dog(String name, int age, String bread) {
		super(name, age);
		this.bread = bread;
	}
	public void displayDetails()
	{
//		System.out.println("Name : "+name);
//		System.out.println("AGe : "+age);
		super.display();
		System.out.println("Breed : "+bread);
	}
	public  void bark()
	{
		System.out.println("Dog is barking ");
	}
	
}