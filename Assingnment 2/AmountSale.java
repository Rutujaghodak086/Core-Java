//17.Write a program to accept quantity and rate for three items, compute the total sales amount, Also compute and print the discount as follows: (amount > //– 20% discount, amount between to – 15% discount, amount between – to -- 8 % discount)

import java.util.Scanner;
public class AmountSale{
	public static void main(String args[]){
		int qty1,qty2,qty3;
		double rate1,rate2,rate3,total_amount,discount=0;

		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter Quantitiy 1");
		qty1=sc.nextInt();
		System.out.println("Enter rate 1");
		rate1=sc.nextDouble();
		
		System.out.println("Enter Quantitiy 2");
		qty2=sc.nextInt();
		System.out.println("Enter rate 2");
		rate2=sc.nextDouble();

		System.out.println("Enter Quantitiy 3");
		qty3=sc.nextInt();
		System.out.println("Enter rate 3");
		rate3=sc.nextDouble();
		
		total_amount=(qty1*rate1)+(qty2*rate2)+(qty3*rate3);

		if(total_amount>10000)
			discount=(20/100)*total_amount;
		else if(total_amount >8000)
			discount=(15/100)*total_amount;
		else if(total_amount >5000)
			discount=(8/100)*total_amount;
		else
			discount=0;
		System.out.println("Total Amount "+total_amount);
		System.out.println("Discount "+discount);
		System.out.println("Payble Amount :"+(total_amount-discount));

	}
}