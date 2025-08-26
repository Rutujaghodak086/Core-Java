//21.Write a program that accepts a number and print it’s all digits


import java.util.Scanner;
public class PrintDigit{
	public static void main(String args[]){
		int n,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0){
			digit=n%10;
			System.out.println(digit);
			n=n/10;
		}
	}
	}