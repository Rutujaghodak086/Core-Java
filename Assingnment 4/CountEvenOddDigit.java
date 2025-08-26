//23.Write a program to accept an integer and count the number of even digits, odd and zero digits in given number


import java.util.Scanner;
public class CountEvenOddDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,digit,even=0,odd=0,zero=0;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		while(n>0){
			digit=n%10;
			if(n==0)
				zero++;
			else if(n%2==0)
				even++;
			else
				odd++;
			n=n/10;
		}
		System.out.println(" Count of Even Number:"+even);
		System.out.println(" Count of  Odd Number:"+odd);
		System.out.println(" Count of Zero Number:"+zero);
	}
}