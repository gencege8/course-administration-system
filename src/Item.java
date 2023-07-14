import java.util.Scanner;

public class Item {
	
	String courseName;
	
	public Item()
	{
		Scanner myScanner= new Scanner(System.in);
		System.out.printf("%s\n","Enter course name");
		courseName=myScanner.nextLine();
	}
	
	public void setCourseName(String a)
	{
		this.courseName=a;
	}
}
