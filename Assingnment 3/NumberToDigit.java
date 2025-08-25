//1.Accept a single digit from the user and display it in words. For example, if digit entered is 9, display Nine.

import java.util.Scanner;
public class NumberToDigit{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit :");
		n=sc.nextInt();
		switch(n){
			case 0->System.out.println("Zero");
			case 1->System.out.println("One");	
			case 2->System.out.println("Two");
			case 3->System.out.println("Three");
			case 4->System.out.println("Four");
			case 5->System.out.println("Fine");
			case 6->System.out.println("Six");
			case 7->System.out.println("Seven");
			case 8->System.out.println("Eight");
			case 9->System.out.println("Nine");
			default->System.out.println("You Enter Invalid Digit ");
		}
	}
}