//11.Write a program to compare two numbers? (==,>,<)

import java.util.Scanner;
public class Compare{
	public static void main(String args[]){
		int a,b;  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number ");
		System.out.println("Enter A ");
		a=sc.nextInt();
		System.out.println("Enter B ");
		b=sc.nextInt();
			
		if(a==b){
			System.out.println("Number is Equal");
		}else if(a>b)
		{
			System.out.println("A is Greater B");
		}else
		{
			System.out.println("A is Less than B ");
		}

	}
}