import java.util.Scanner;

public class Person implements Schedule {
	
	String fullName;
	int ID;
	
	public Person() {
		
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("Enter name:");
		fullName=myScanner.nextLine();
		System.out.println("Enter ID:");
		ID=myScanner.nextInt();
		myScanner.nextLine();
		
	}
	public void displaySchedule() {
		
	}
}
