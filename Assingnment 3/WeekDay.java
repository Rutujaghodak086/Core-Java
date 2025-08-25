//5.Write a program to accept the week day as number from user and display Monday to Sunday.


import java.util.Scanner;
public class WeekDay{
	public static void main(String args[]){
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day of Week(1-7) :");
		day=sc.nextInt();
	
		switch(day){
			case 1->System.out.println("Monday");
			case 2->System.out.println("Tuesday");
			case 3->System.out.println("Wednesday");
			case 4->System.out.println("Thursday");
			case 5->System.out.println("Friday");
			case 6->System.out.println("Saturday");
			case 7->System.out.println("Sunday");
		}
	}
}