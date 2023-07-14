import java.util.Scanner;

public class DayTime {
	
	int day;
	int hour;
	int minute;
	int sec;
	
	public DayTime()
	{
		Scanner myScanner=new Scanner(System.in);
		System.out.println("day:");
		day=myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("hour:");
		hour=myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("minute:");
		minute=myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("second:");
		sec=myScanner.nextInt();
		myScanner.nextLine();
		
	}
}
