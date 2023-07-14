import java.util.Scanner;


public class Assignment extends Item {
	
	String assignmentId;
	String description;
	Date dueDate;
	
	
	public Assignment() {
		
		super();
		Scanner myScanner= new Scanner(System.in);
		System.out.printf("%s\n","Enter assignment id");
		assignmentId=myScanner.nextLine();
		System.out.println("Enter assignment description");
		description=myScanner.nextLine();
		dueDate=new Date();
	}
	
	public int getDay()
	{
		return  dueDate.day;
	}
	public int getMonth()
	{
		return  dueDate.month;
	}
	public int getYear()
	{
		return  dueDate.year;
	}
	
	

}
