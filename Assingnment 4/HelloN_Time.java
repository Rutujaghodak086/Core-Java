//2.Write a program to print hello N times

import java.util.Scanner;
public class HelloN_Time{
	public static void main(String args[]){
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextInt();
		for(i=0;i<n;i++){
			System.out.println("Hello");
		}
	}
}