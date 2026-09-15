
package inheritancePrograms;

public class Qsn08 {

    public static void main(String args[])
    {
        Tester t = new Tester("Deepak", 101, 30000, 5000, 4000, 10, 200);

        t.displayDetails();

        System.out.println("Total Salary : " + t.calculateSalary());
    }
}

class Developer
{
    public String name;
    public int id;
    public double basicSalary;
    public double bonus;

    public Developer(String name, int id, double basicSalary, double bonus)
    {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public void displayDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Bonus : " + bonus);
    }
}

class Manager01 extends Developer
{
    public double incentive;

    public Manager01(String name, int id, double basicSalary, double bonus, double incentive)
    {
        super(name, id, basicSalary, bonus);
        this.incentive = incentive;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Incentive : " + incentive);
    }

    public double calculateSalary()
    {
        return basicSalary + bonus + incentive;
    }
}

class Tester extends Manager01
{
    public double overTimeHours;
    public double ratePerHour;

    public Tester(String name, int id, double basicSalary, double bonus,
                   double incentive, double overTimeHours, double ratePerHour)
    {
        super(name, id, basicSalary, bonus, incentive);
        this.overTimeHours = overTimeHours;
        this.ratePerHour = ratePerHour;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Overtime Hours : " + overTimeHours);
        System.out.println("Rate Per Hour : " + ratePerHour);
    }

    public double calculateSalary()
    {
        return super.calculateSalary() + (overTimeHours * ratePerHour);
    }
}
