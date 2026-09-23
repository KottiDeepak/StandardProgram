import java.util.Scanner;

public class InnerClasslab5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		University u = new University();
		u.evaluate(marks);

	}
}

class University {
	public void evaluate(int marks) {
		class GradePolicy {
			void calculateGrade() {
				String grade;
				if (marks >= 80) {
					grade = "A";
					System.out.println("Grade " + grade);
				} else {
					if (marks >= 60) {
						grade = "B";
						System.out.println("Grade " + grade);
					} else {
						if (marks >= 50) {
							grade = "C";
							System.out.println("Grade " + grade);
						} else {
							grade = "Fail";
							System.out.println(grade);
						}
					}
				}
			}
		}
		GradePolicy policy = new GradePolicy();
		policy.calculateGrade();
	}
}
