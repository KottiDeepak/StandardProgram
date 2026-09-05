import java.util.Scanner;

public class Lab11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name and status: ");
		String patientName=sc.nextLine();
		String status=sc.nextLine();
		Checkup c=new Checkup(patientName,status);
		c.displayCheckStatus();
		
		
	}

}
class Patient
{
	public String patientName;

	public Patient(String patientName) {
		super();
		this.patientName = patientName;
	}
	
}
class Checkup extends Patient {
	public String status;
	public Checkup(String patientName,String status) {
		super(patientName);	
		this.status=status;
	}	
	public void displayCheckStatus()
	{
		System.out.println("Checkup");
		System.out.println(status);
	}
}