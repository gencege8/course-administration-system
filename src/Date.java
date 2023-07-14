import java.util.Scanner;

public class Date {
		
	int day;
	int month;
	int year;
	
	public Date()
	{
		Scanner myScanner= new Scanner(System.in);
		System.out.printf("%s\n","Enter day");
		day=myScanner.nextInt();
		myScanner.nextLine();
		System.out.printf("%s\n","Enter month");
		month=myScanner.nextInt();
		myScanner.nextLine();
		System.out.printf("%s\n","Enter year");
		year=myScanner.nextInt();
		myScanner.nextLine();
		
	}
	
}
