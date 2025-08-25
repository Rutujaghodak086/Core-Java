//Write a program to find maximum of three numbers? (3-4 logics) and (with conditional operator). Modify and find minimum of three number

import java.util.Scanner;
public class MinnimumNumber{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Number ");
		System.out.println("Enter A :");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		System.out.println("Enter c :");
		c=sc.nextInt();
		if(a<b && a<c){
			System.out.println("A is Minimum ");
		}else if(b<c && b<a)
		{
			System.out.println("B is Minimum");

		}else
		{
			System.out.println("C is Minimum ");
		}
	}
}
		