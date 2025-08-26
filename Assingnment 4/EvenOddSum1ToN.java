//17.Write a program to find sum of even numbers from 1 to N (or odd numbers)

import java.util.Scanner;
public class EvenOddSum1ToN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,i,esum=0,osum=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			if(i%2==0){
				esum+=i;
			}
			else
				osum+=i;		
			System.out.println("Even Sum is"+esum);
			System.out.println("Odd sum is"+osum);
	}
}