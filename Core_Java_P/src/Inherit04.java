import java.util.Scanner;

public class Inherit04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		int choice =sc.nextInt();
		int id=sc.nextInt();
		double  load=sc.nextDouble();
		double capacity=sc.nextDouble();
		

        BaseServer server;

        if (choice == 1) {
            server = new LinuxServer();
        } else {
            server = new WindowsServer();
        }

        server.setServerDetails(id, load, capacity);

        server.displayServerDetails();

        System.out.println("Final CPU Load: " + (int)server.getCurrentLoad());
	}
	
}
class BaseServer
{
	public int serverId;
	public double baseLoad;
	public double maxCapacity;
	 void setServerDetails(int id, double load, double capacity) {
	        serverId = id;
	        baseLoad = load;
	        maxCapacity = capacity;
	    }
	 void displayServerDetails() {
	        System.out.println("Server ID: " + serverId);
	        System.out.println("Base Load: " + (int) baseLoad);
	        System.out.println("Max Capacity: " + (int) maxCapacity);
	    }
	 double getCurrentLoad() {
	        return baseLoad;
	    }
}
class LinuxServer extends BaseServer
{
	   double getCurrentLoad() {
	        double load = baseLoad - (baseLoad * 10 / 100);

	        if (load > maxCapacity) {
	            load = maxCapacity;
	        }

	        return load;
	    }
}
class WindowsServer extends BaseServer
{
	 double getCurrentLoad() {
	        double load = baseLoad + (baseLoad * 5 / 100);

	        if (load > maxCapacity) {
	            load = maxCapacity;
	        }

	        return load;
	    }
}
