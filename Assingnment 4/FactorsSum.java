//30.Write a program to print sum of factors of a given number


import java.util.Scanner;
public class FactorsSum{
	public static void main(String args[]){
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		n=sc.nextInt();
		System.out.println("Factors of"+n+"are");
		int sum=0;
		for(i=1;i<=n;i++)
			if(n%i==0)
				 sum +=i;
				System.out.println("Sum is "+sum);
	}
}