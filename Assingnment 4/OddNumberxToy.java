//14.Write a program to print even numbers from x to y (both inclusive) (or odd numbers)

import java.util.Scanner;
public class OddNumberxToy{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number ");
		int x=sc.nextInt();
		System.out.println("Enter Second Number ");
		int y=sc.nextInt();
		for(int i=x;i<=y;i++)
			if(i%2!=0){
				System.out.println(i);
			}
	}
}