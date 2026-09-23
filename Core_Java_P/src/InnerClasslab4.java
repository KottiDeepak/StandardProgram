import java.util.Scanner;
public class 78m  {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String studentName=sc.nextLine();
		int theoryMarks=sc.nextInt();
		int practicalMarks=sc.nextInt();
		if(theoryMarks>50||theoryMarks<0)
		{
			System.out.println("Error: Theory marks must be between 0 and 50");
			return ;
		}
		ExamSystem e=new ExamSystem(studentName,theoryMarks,practicalMarks);
	e.evaluteResult();
		
		
	}
}
class ExamSystem
{
	String studentName;
	int theoryMarks;
	int practicalMarks;
	public ExamSystem(String studentName, int theoryMarks, int practicalMarks) {
		super();
		this.studentName = studentName;
		this.theoryMarks = theoryMarks;
		this.practicalMarks = practicalMarks;
	}
	public void evaluteResult()
	{
		class ResultEvaluator
		{
			void printResult()
			{
				 int totalMarks=theoryMarks+practicalMarks;
				 System.out.println("Student: "+studentName);
				 System.out.println("Total marks: "+totalMarks);
				 if(totalMarks>=50)
				 {
					 System.out.println("Result: Pass");
					 return;
				 }
				 else 
				 {
					 System.out.println("Result: Fail");
				 }
			}
		}
		
	}
}
