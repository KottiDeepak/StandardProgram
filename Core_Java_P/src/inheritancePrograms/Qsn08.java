package inheritancePrograms;

public class Qsn08 {

}
class Developer
{
	public String name;
	public int id;
	public double basicSalary;
	public double bonus;
	public Developer(String name, int id, double basicSalary, double bonus) {
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	
	}
}

class Manager extends Developer 
{
	public double incentive;

	public Manager(String name, int id, double basicSalary, double bonus, double incentive) {
		super(name, id, basicSalary, bonus);
		this.incentive = incentive;
	}
	public void displayDetails()
	{

	}
	public double  calculateSalary()
	{
		return basicSalary+incentive;
	}
}
class Tester extends Manager
{
	public double overTimeHours;
	public double ratePerHour;
	public Tester(String name, int id, double basicSalary, double bonus, double incentive, double overTimeHours,
			double ratePerHour) {
		super(name, id, basicSalary, bonus, incentive);
		this.overTimeHours = overTimeHours;
		this.ratePerHour = ratePerHour;
	}
	public void displayDetails()
	{
		super.di
	}
	
	
}