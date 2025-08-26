//20.Write a program to accept to integers x and n computer x^n.

import java.util.Scanner;
public class Integer{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,n,i,result=1;
		System.out.println("Enter X ");
		x=sc.nextInt();
		System.out.println("Enter n");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
			result*=x;
		System.out.println(x + " raised to the power of " + n + " = " + result);
  
	}
}

