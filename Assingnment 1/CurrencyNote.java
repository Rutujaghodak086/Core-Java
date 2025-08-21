//A cashier has currency notes of denomination 1, 5 and 10. Accept the amount to be withdrawn from the user and print the total number of currency notes of //each denomination the cashier will have to give.

import java.util.Scanner;
public class CurrencyNote{
	public static void main(String args[]){
		int amount;
		int note10,note5,note1,rem10,rem5;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Amount to Withdrawn :");
		amount=sc.nextInt();

		note10=amount/10;
		rem10=amount%10;

		note5=rem10/5;
		rem5=rem10 % 5;
		
		note1=rem5;

		System.out.println("Currency Note :");
		System.out.println("Number  of 10 notes :"+note10);
		System.out.println("NUmber of 5 notes :"+note5);
		System.out.println("Number of 1 notes :"+note1);
	}
	}