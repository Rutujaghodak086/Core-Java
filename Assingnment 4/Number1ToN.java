//5.Write a program to print 1 to N

import java.util.Scanner;
public class Number1ToN{
	public static void main(String args[]){
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}