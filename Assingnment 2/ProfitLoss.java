<<<<<<< HEAD
//Accept the cost price and selling price from the keyboard. Find out if the seller has made a profit or loss and display how much profit or loss has been made?

import java.util.Scanner;
public class ProfitLoss{
	public static void main(String args[]){
		float cp,sp;
		double l,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cost price ");
		cp=sc.nextFloat();
		System.out.println("Enter Selling Price ");
		sp=sc.nextFloat();

		if(sp>cp){
				p=sp-cp;
				System.out.println("Profit is "+p);
		}
		else if(cp>sp){
				l=cp-sp;
				System.out.println("Loss is "+l);
		}
		else {
			System.out.println(" No profit No Loss ");
		}
	}
}
=======
//Accept the cost price and selling price from the keyboard. Find out if the seller has made a profit or loss and display how much profit or loss has been made?

import java.util.Scanner;
public class ProfitLoss{
	public static void main(String args[]){
		float cp,sp;
		double l,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cost price ");
		cp=sc.nextFloat();
		System.out.println("Enter Selling Price ");
		sp=sc.nextFloat();

		if(sp>cp){
				p=sp-cp;
				System.out.println("Profit is "+p);
		}
		else if(cp>sp){
				l=cp-sp;
				System.out.println("Loss is "+l);
		}
		else {
			System.out.println(" No profit No Loss ");
		}
	}
}
>>>>>>> aa2ff3d91efe8466b518178892caff45fc5d7ebc
