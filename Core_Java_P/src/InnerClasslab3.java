import java.util.Scanner;
public class InnerClasslab3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mallName=sc.nextLine();
		int totalSlots=sc.nextInt();
		int occupiedSlots=sc.nextInt();
		if(occupiedSlots>totalSlots)
		{
			System.out.println("Error: Occupied slots cannot exceed total slots");
			return ;
		}
		ParkingLot p=new ParkingLot(mallName,totalSlots,occupiedSlots);
		int availableSlots =
	            ParkingLot.SlotCalculator.calculateAvailSlots(
	                p.totalSlots, p.occupiedSlots
	            );
		System.out.println("Mall: "+p.mallName);
		System.out.println("Available parking slots: "+availableSlots);
	}
	
}
class ParkingLot
{
	String mallName;
	int totalSlots;
	int occupiedSlots;
	public ParkingLot(String mallName, int totalSlots, int occupiedSlots) {
		super();
		this.mallName = mallName;
		this.totalSlots = totalSlots;
		this.occupiedSlots = occupiedSlots;
	}
	static class SlotCalculator
	{
		static int calculateAvailSlots(int totalSlots,int occupiedSlots)
		{
			return totalSlots-occupiedSlots;
		}
	}
	
}
