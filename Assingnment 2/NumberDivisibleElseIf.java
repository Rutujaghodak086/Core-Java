//Write a program to check whether given number is divisible by 5 or 7? ( with else if)

import java.util.Scanner;
public class NumberDivisibleElseIf{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		
		if(n%5==0){
			System.out.println("Number is Divisible by 5 ");
		}
		else if(n%7==0){
			System.out.println("Number is Divisibel by 7 ");
		}
		else {
			System.out.println("Number is Not Divisible by Both 5 & 7 ");
		}
	}
}

