
import java.util.Scanner;
public class MinimumNumber1{
	public static void main(String args[]){
		int a,b,c,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Number ");
		System.out.println("Enter A :");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		System.out.println("Enter c :");
		c=sc.nextInt();
		
		
		if (a <= b && a <= c) min = a;
		else if (b <= a && b <= c) min = b;
		else min = c;
		System.out.println("Minimum Number :"+b);

		
		
		}
	}