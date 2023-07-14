import java.util.Scanner;

public class Submission {
	
	String studentName;
	int studentId;
	String courseName;
	String assignmentId;
	Date submissionDate;
	int grade;
	
	public Submission() {
		
		Scanner myScanner= new Scanner(System.in);
		System.out.printf("%s\n","Enter student name");
		studentName=myScanner.nextLine();
		System.out.printf("%s\n","Enter student id");
		studentId=myScanner.nextInt();
		myScanner.nextLine();
		submissionDate=new Date();
		
	}
	public void setCourseName(String a)
	{
		this.courseName=a;
	}
	public void setGrade(int a)
	{
		this.grade=a;
	}
	public void setAssignmentId(String a)
	{
		this.assignmentId=a;
	}
	public int getDay()
	{
		return  submissionDate.day;
	}
	public int getMonth()
	{
		return  submissionDate.month;
	}
	public int getYear()
	{
		return  submissionDate.year;
	}

}
