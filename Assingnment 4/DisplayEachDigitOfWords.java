//28.Write a program which accepts a number and display each digit of number in words

import java.util.Scanner;
public class DisplayEachDigitOfWords{
	public static void main(String args[]){
		int no,sum=0,digit,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		
		while(n>0){
			digit=n%10;
			sum=sum*10+digit;
			n=n/10;
		}
		no=sum;
		while(no>0){
			digit=no%10;
			switch(digit){
				case 1->System.out.println("One");
				case 2->System.out.println("Two");
				case 3->System.out.println("Three");
				case 4->System.out.println("Four");
				case 5->System.out.println("Five");
				case 6->System.out.println("Six");
				case 7->System.out.println("Seven");
				case 8->System.out.println("Eight");
				case 9->System.out.println("Nine");
				case 0->System.out.println("Zero");
			}
			no=no/10;
		}
	}
}