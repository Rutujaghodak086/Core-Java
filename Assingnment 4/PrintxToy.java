//6.Write a program to print x to y (both inclusive)

import java.util.Scanner;
public class PrintxToy{
	public static void main(String args[]){
		int x,y,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X is Starting Number ");
		x=sc.nextInt();
		System.out.println("Enter Y is Ending Number ");
		y=sc.nextInt();
		for(i=x;i<=y;i++){
			System.out.println(i);
		}
	}
}