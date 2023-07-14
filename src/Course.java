import java.util.Scanner;


public class Course extends Item implements Schedule {
	
	int courseCode;
	Lecturer lecturer;
	DayTime dayTime;
	
	public Course()
	{
		super();
		Scanner myScanner= new Scanner(System.in);
		System.out.printf("%s\n","Enter course code");
		courseCode=myScanner.nextInt();
		myScanner.nextLine();
	}
	
	
	public void random(String a) {
		
	}
      
}
