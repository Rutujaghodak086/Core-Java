//9.Accept any year as input through the keyboard. Write a program to check whether the year isa leap year or not. (Hint leap year is divisible by 4 and not by 100 or divisible by 400)


import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year ");
		year=sc.nextInt();
		if(year%4==0)
		System.out.println("Year is Leap ");
		else
		System.out.println("Year is Not Leap ");
	}
}