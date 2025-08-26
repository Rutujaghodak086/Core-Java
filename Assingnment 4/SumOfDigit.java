//24.Write a program to find sum of digits of given number.



import java.util.Scanner;
public class SumOfDigit{
	public static void main(String args[]){
		int n,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		while(n>0){
			digit=n%10;
			sum+=digit;
			n=n/10;
		}
		System.out.println("Sum of digit is :"+sum);
	}
}