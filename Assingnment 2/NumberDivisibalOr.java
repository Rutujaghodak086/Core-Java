//Write a program to check whether given number is divisible by 5 or 7? (with || operator and with else if)

import java.util.Scanner;
public class NumberDivisibalOr{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();		

		if(n%5==0 || n%7==0)
			System.out.println("Number is Divisible by 5 and 7 ");
		else
			System.out.println("Number is not Divisible by Both  5 and 7 ");
		}
	}