//32.Write a program to print, count and sum of factors

import  java.util.Scanner;
public class PrintSumCountFactors{
	public static void main(String args[]){
		int n,i,sum=0,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		System.out.println("Factors are "+n+"is");
		for(i=1;i<=n;i++)
			if(n%i==0){
				sum+=i;
				cnt++;
				System.out.println(i);
			}
			System.out.println();
			System.out.println("Count is :"+cnt);
			System.out.println("Sum of Factors is :"+sum);
	}
}