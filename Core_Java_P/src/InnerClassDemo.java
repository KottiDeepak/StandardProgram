
public class InnerClassDemo {
	public static void main(String args[]) {
		Car.Engine eng = new Car().new Engine(200, 15);
		Car car = new Car("i20", eng);
		System.out.println(car);
//		Car car=new Car("i20",eng);
	}
}

class Car {
	public String name;
	public Engine engine;

	public Car() {
	}

	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}

	public String toString() {
		return "car [name=" + name + ", engine=" + engine + "]";
	}

	 class Engine {
		public int hp;
		public double milage;

		public Engine(int hp, double milage) {
			super();
			this.hp = hp;
			this.milage = milage;
		}

		public String toString() {
			return "Engine [hp=" + hp + ", milage=" + milage + "]";
		}
	}
}

class Animal {
	// public Engine engine;

}

class Fruit {
	// public Car car;
}
