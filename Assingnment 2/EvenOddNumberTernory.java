import java.util.Scanner;
public class EvenOddNumberTernory{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=sc.nextInt();
		System.out.println((n%2==0)?"Even Number":"Odd Number");
	}
}