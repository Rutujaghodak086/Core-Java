//9.Write a program to find sum of 1 to N (sum of first N numbers) (without loop)

import java.util.Scanner;
public class  Sum1ToNWthoutLoop{
	public static void main(String args[]){
		int n;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		n=sc.nextInt();
		sum=n*(n+1)/2;
		System.out.println("Sum of 1 to N :"+sum);
	}
}