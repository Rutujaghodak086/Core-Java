//5.Write a program to print perfect numbers between 1 to n.

import java.util.Scanner;
public class PerfectNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
			 sum +=i;
		}
		if(sum==n)
			System.out.println("Number is Perfect");
		else
			System.out.println("Number is not perfect");
	}
}
