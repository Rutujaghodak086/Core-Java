//34.Write a program to check whether a given number is prime number

import java.util.Scanner;
public class Prime{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int cnt=0;
		
		for(int i=1;i<=n;i++)
			if(n%i==0){
				cnt++;
			}
			if(cnt==2)
				System.out.println("Prime Number");
			else
				System.out.println("Not Prime Number");
	}
}