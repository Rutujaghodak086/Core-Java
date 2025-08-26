//10.Write a program to find sum of x to y (both inclusive

import java.util.Scanner;
public class SumxToy{
	public static void main(String args[]){
		int x,y,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a X Starting Number");
		x=sc.nextInt();
		System.out.println("Enter a Y Ending Number");
		y=sc.nextInt();
		for(i=x;i<=y;i++){
			sum+=i;
		}
		System.out.println("Sum of X To Y :"+sum);
	}
}