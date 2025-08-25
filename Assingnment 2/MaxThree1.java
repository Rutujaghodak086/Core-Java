//12.Write a program to find maximum of three numbers? (3-4 logics) and (with conditional operator). Modify and find minimum of three numbers

import java.util.Scanner;
public class MaxThree1{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number ");
		a=sc.nextInt();
		System.out.println("Enter 2nd Number ");
		b=sc.nextInt();
		System.out.println("Enter 3rd Number ");
		c=sc.nextInt();
		if(a>=b && a>=c)
		{
		System.out.println("A is maximum ");
		}
		else if(b>=a && b>=c)
		{
			System.out.println("B is maximum ");
		}
		else
		{
			System.out.println("C is maximum ");
		}
	}
}
		
		