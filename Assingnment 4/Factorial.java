//19.Write a program to find factorial of N (N!).(3! = 3*2*1 or 1*2*3)

import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int n,i,result=1;
		System.out.println("Enter a Number :");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			result*=i;
		System.out.println("Factorial is:"+result);
	}
}