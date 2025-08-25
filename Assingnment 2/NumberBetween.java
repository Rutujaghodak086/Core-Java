//7.Write a program to accept three numbers and check whether the first is between the other two numbers. Ex: Input 20 10 30. Output: 20 is between 10and 30


import java.util.Scanner;
public class  NumberBetween{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Three number :");
		System.out.println("Enter First Number ");
		a=sc.nextInt();
		System.out.println("Enter Second Number ");
		b=sc.nextInt();
		System.out.println("Enter Third Number ");
		c=sc.nextInt();
		if ((a >= b && a <= c) || (a >= c && a <= b)) {
			System.out.println(a + " is between " + b + " and " + c);
			}
		 else if ((b >= a && b <= c) || (b >= c && b <= a)) {
			System.out.println(b + " is between " + a + " and " + c);
		}
		 else if ((c >= a && c <= b) || (c >= b && c <= a)) {
			System.out.println(c + " is between " + a + " and " + b);
		} 
		else {
			System.out.println("No number is between the other two.");
		}

	}
}
 