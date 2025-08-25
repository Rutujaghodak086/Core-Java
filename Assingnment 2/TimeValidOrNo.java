import java.util.Scanner;
public class TimeValidOrNo{
	public static void main(String args[]){
		int hour,minute,second;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Time ");
		System.out.println("Enter a hour :");
		hour=sc.nextInt();
		System.out.println("Enter a minute :");
		minute=sc.nextInt();
		System.out.println("Enter a Second :");
		second=sc.nextInt();
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60)	
		System.out.println("Time is Valid ");
		else
		System.out.println("Time is Invalid");
	}
}	
