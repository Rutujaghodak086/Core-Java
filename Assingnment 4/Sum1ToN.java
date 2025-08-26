// 9.Write a program to find sum of 1 to N (sum of first N numbers) (with and without loop)

import java.util.Scanner;
public class Sum1ToN{
	public static void main(String args[]){
		int n,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("Sum is 1 To N :"+sum);
	}
}