package hasArelationshipProgram;

public class HasADemo {
	public static void main(String[] args) {
		Engine en = new Engine("Petrol", 1.5);
		Car c = new Car("Honda","Black",150,en);
		c.disply();
		
	}

}
class Car{
	
	String company;
	String colour;
	double topSpeed;
	Engine engine;
	public Car(String company, String colour, double topSpeed, Engine engine) {
		
		this.company = company;
		this.colour = colour;
		this.topSpeed = topSpeed;
		this.engine = engine;
	}
	public void disply() {
		System.out.println(company);
		System.out.println(colour);
		System.out.println(topSpeed);
		engine.display();
	
	}
}
class Engine{
	
	String fuelType;
	double cc ;
	public Engine(String fuelType, double cc) {
		
		this.fuelType = fuelType;
		this.cc = cc;
	}
	public void display() {
		
		System.out.println(fuelType);
		System.out.println(cc);
	}
	
}