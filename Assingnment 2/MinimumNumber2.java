
import java.util.Scanner;
public class MinimumNumber2{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Number ");
		System.out.println("Enter A :");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		System.out.println("Enter c :");
		c=sc.nextInt();
		
		int min = (a < b ? (a < c ? a : c) : (b < c ? b : c));

		System.out.println("Minimum Number :"+b);

		
		
		}
	}