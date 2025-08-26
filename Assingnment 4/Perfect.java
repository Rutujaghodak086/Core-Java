//33.Write a program to check whether a given number is perfect number.

import java.util.Scanner;
public class Perfect{
	public static void main(String args[]){
		int i,n,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		temp=n;
		for(i=1;i<n;i++)
			if(n%i==0){
				sum+=i;
			}
			if(temp==sum)
				System.out.println("Number is Perfect ");
			else
				System.out.println("Number is Not perfect");
	}
}