//19.Write a Program to convert lowercase letter into uppercase letter and vice versa.

import java.util.Scanner;
public class Convert{
	public static void main(String args[]){
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character :");
		ch=sc.next().charAt(0);
		
		if(Character.isLowerCase(ch))
			System.out.println("UpperCase:"+Character.toUpperCase(ch));
		else if(Character.isUpperCase(ch))
			System.out.println("LowerCase:"+Character.toLowerCase(ch));
		else
			System.out.println("Not a Alphbate Character");
	}
}