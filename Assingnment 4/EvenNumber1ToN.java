//13.Write a program to print even numbers from 1 to N (or numbers)

import java.util.Scanner;
public class EvenNumber1ToN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			if(i%2==0){
				System.out.println(i);
			}
	}
}
	